package com.xukaiqiang.export;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Map.Entry;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import com.alibaba.fastjson.JSON;
import com.xukaiqiang.entity.Collection;
import com.xukaiqiang.entity.Data;
import com.xukaiqiang.entity.Folder;
import com.xukaiqiang.entity.Request;
import com.xukaiqiang.entity.Response;
import com.xukaiqiang.entity.Url;
import com.xukaiqiang.entity.common.Common;
import com.xukaiqiang.entity.makeloancheck.ApplyPeople;
import com.xukaiqiang.entity.makeloancheck.GoodsList;
import com.xukaiqiang.entity.makeloancheck.MakeLoanCheckList;
import com.xukaiqiang.entity.makeloancheck3.LoanApplyResponse;
import com.xukaiqiang.entity.task.TaskCancel;
import com.xukaiqiang.entity.task.TaskDone;
import com.xukaiqiang.entity.task.TaskSettled;
import com.xukaiqiang.entity.task.TaskToDo;
import com.xukaiqiang.entity.telcheck.TelCheck;
import com.xukaiqiang.entity.telcheck.TelLst;
import com.xukaiqiang.entity.usemoneyApply.ApplyPeopleAccountList;
import com.xukaiqiang.util.DBHelper;
import com.xukaiqiang.util.ReadJsonUtil;
import com.xukaiqiang.util.StringUtils;

public class ExportData2 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// 读取json数据
		String jsonStr = ReadJsonUtil.readJson("D:/test/bb.json");
		Collection collection = JSON.parseObject(jsonStr, Collection.class);

		for (Folder folder : collection.getFolders()) {
			// 创建Excel
			HSSFWorkbook wb = new HSSFWorkbook();
			CellStyle style = wb.createCellStyle();
			style.setFillForegroundColor(HSSFColor.YELLOW.index);
			style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
			style.setBorderBottom(HSSFCellStyle.BORDER_THIN); // 下边框
			style.setBorderLeft(HSSFCellStyle.BORDER_THIN);// 左边框
			style.setBorderTop(HSSFCellStyle.BORDER_THIN);// 上边框
			style.setBorderRight(HSSFCellStyle.BORDER_THIN);// 右边框
			// 创建sheet
			for (Request request : collection.getRequests()) {
				if (folder.getId().equals(request.getFolder())) {
					System.out.println("输出请求的名称："+request.getName());
					Sheet sheet1 = wb.createSheet(request.getName());
					wb.getSheet(request.getName()).setDefaultColumnWidth(50);
					// 创建行
					Url url = StringUtils.getBasicUrl(request.getUrl());
					// 设置报文名称 报文说明 请求地址
					Row row1 = sheet1.createRow(0);
					Cell cell1_3 = row1.createCell(2);
					cell1_3.setCellValue(url.getBasicUrl());
					Cell cell1_2 = row1.createCell(1);
					cell1_2.setCellValue(request.getName());
					Cell cell1_1 = row1.createCell(0);
					cell1_1.setCellValue(request.getName());
					cell1_1.setCellStyle(style);
					cell1_2.setCellStyle(style);
					cell1_3.setCellStyle(style);
					// 请求字段 字段说明 样例数据
					int row = 2;
					if (null != url.getValues()) {
						for (Entry<String, String> entry : url.getValues().entrySet()) {
							Row row2 = sheet1.createRow(row);

							Cell cell2_1 = row2.createCell(0);
							cell2_1.setCellValue(entry.getKey());

							Cell cell2_2 = row2.createCell(1);
							String name = new DBHelper().queryNameByColumn(entry.getKey());
							cell2_2.setCellValue(name);

							Cell cell2_3 = row2.createCell(2);
							cell2_3.setCellValue(entry.getValue());

							cell2_1.setCellStyle(style);
							cell2_2.setCellStyle(style);
							cell2_3.setCellStyle(style);
							row++;
						}
						// 添加的一些方法
					} else if (null != request.getData() && !request.getMethod().equals("GET")) {
						for (Data data : request.getData()) {
							Row row2 = sheet1.createRow(row);

							Cell cell2_1 = row2.createCell(0);
							cell2_1.setCellValue(data.getKey());

							Cell cell2_2 = row2.createCell(1);
							String name = new DBHelper().queryNameByColumn(data.getKey());
							cell2_2.setCellValue(name);

							Cell cell2_3 = row2.createCell(2);
							cell2_3.setCellValue(data.getValue());

							cell2_1.setCellStyle(style);
							cell2_2.setCellStyle(style);
							cell2_3.setCellStyle(style);
							row++;
						}
					}
					//////////////////////////////////////////////////////////////////////////////////////////////////
					// 任务
					if (request.getName().trim().equals("查询待办任务列表分页")) {
						insertValues(sheet1, row, style, TaskToDo.class);
					} else if (request.getName().trim().equals("查询已结任务列表分页")) {
						insertValues(sheet1, row, style, TaskSettled.class);
					} else if (request.getName().trim().equals("查询已办任务列表分页")) {
						insertValues(sheet1, row, style, TaskDone.class);
					} else if (request.getName().trim().equals("查询取消任务列表分页")) {
						insertValues(sheet1, row, style, TaskCancel.class);

						// 放款审查
					} else if (request.getName().trim().equals("查询主申请人和共同申请人")) {
						insertValues(sheet1, row, style, ApplyPeople.class);
					} else if (request.getName().trim().equals("查询商品列表")) {
						insertValues(sheet1, row, style, GoodsList.class);
					} else if (request.getName().trim().equals("放款审查进件列表查询")) {
						insertValues(sheet1, row, style, MakeLoanCheckList.class);
					} else if (request.getName().trim().equals("查询公共内容放款审查")) {
						 insertValues(sheet1, row, style, LoanApplyResponse.class);
					}

					// 用款申请
					else if (request.getName().trim().equals("查询公共内容")) {
						// insertValues(sheet1, row, style, GoodsList.class);
					} else if (request.getName().trim().equals("查询商品列表")) {
						insertValues(sheet1, row, style, GoodsList.class);
					} else if (request.getName().trim().equals("申请人账号列表")) {
						insertValues(sheet1, row, style, ApplyPeopleAccountList.class);
					}

					// 电话回访
					else if (request.getName().trim().equals("电话回访信息")) {
						insertValues(sheet1, row, style, TelCheck.class);
					} else if (request.getName().trim().equals("电话回访进件信息")) {
						insertValues(sheet1, row, style, TelLst.class);
					}

					//////////////////////////////////////////////////////////////////////////////////////////////////
				}
			}

			// 保存为Excel文件
			FileOutputStream out = null;
			try {
				out = new FileOutputStream("D:/test/" + folder.getName() + ".xlsx");
				wb.write(out);
			} catch (IOException e) {
				System.out.println(e.toString());
			} finally {
				try {
					out.close();
				} catch (IOException e) {
					System.out.println(e.toString());
				}
			}

		}

	}

	// response
	public static void insertValues(Sheet sheet1, int row, CellStyle style, Class class1) {

		Row row4 = sheet1.createRow(row + 1);
		Cell cell2_11 = row4.createCell(0);
		cell2_11.setCellValue("totalPages");
		cell2_11.setCellStyle(style);
		Cell cell2_2ttt = row4.createCell(1);
		cell2_2ttt.setCellValue("总页数");
		cell2_2ttt.setCellStyle(style);
		Cell cell2_3hhh = row4.createCell(2);
		cell2_3hhh.setCellValue("1");
		cell2_3hhh.setCellStyle(style);

		Row row5 = sheet1.createRow(row + 2);
		Cell cell2_111 = row5.createCell(0);
		cell2_111.setCellValue("totalElements");
		cell2_111.setCellStyle(style);
		Cell cell333 = row5.createCell(1);
		cell333.setCellValue("总记录数");
		cell333.setCellStyle(style);
		Cell cell444 = row5.createCell(2);
		cell444.setCellValue("20");
		cell444.setCellStyle(style);

		Row row6 = sheet1.createRow(row + 3);
		Cell cell2_22 = row6.createCell(0);
		cell2_22.setCellValue("number");
		cell2_22.setCellStyle(style);
		Cell cell2_2f = row6.createCell(1);
		cell2_2f.setCellValue("当前页码(0开始)");
		cell2_2f.setCellStyle(style);
		Cell cell2_3d = row6.createCell(2);
		cell2_3d.setCellValue("0");
		cell2_3d.setCellStyle(style);

		Row rr = sheet1.createRow(row + 4);
		Cell cell2_33 = rr.createCell(0);
		cell2_33.setCellValue("size");
		cell2_33.setCellStyle(style);
		Cell cell2_223 = rr.createCell(1);
		cell2_223.setCellValue("每页记录数");
		cell2_223.setCellStyle(style);
		Cell ffff = rr.createCell(2);
		ffff.setCellValue("20");
		ffff.setCellStyle(style);

		Row rowt = sheet1.createRow(row + 5);
		Cell cell2_334 = rowt.createCell(0);
		cell2_334.setCellValue("pages");
		cell2_334.setCellStyle(style);
		Cell cell2_2e = rowt.createCell(1);
		cell2_2e.setCellValue("连续分页页码");
		cell2_2e.setCellStyle(style);
		Cell cell2_3q = rowt.createCell(2);
		cell2_3q.setCellValue("[0]");
		cell2_3q.setCellStyle(style);
		// 设置response
		row = row + 6;
		Field[] fields = class1.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			Field f = fields[i];
			if (f.getType().toString().endsWith("String") || f.getType().toString().endsWith("Integer")) {
				Row row2 = sheet1.createRow(row + i);
				// 第一列
				Cell cell2_1 = row2.createCell(0);
				cell2_1.setCellValue(f.getName());
				cell2_1.setCellStyle(style);
				// 第二列
				Cell cell2_2 = row2.createCell(1);
				String name = new DBHelper().queryNameByColumn(f.getName());
				cell2_2.setCellValue(name);
				cell2_2.setCellStyle(style);
				// 第三列
				String type = f.getType().toString();// 得到此属性的类型
				if (type.endsWith("String")) {
					Cell cell2_3 = row2.createCell(2);
					cell2_3.setCellValue("字段值");
					cell2_3.setCellStyle(style);
				} else if (type.endsWith("int") || type.endsWith("Integer")) {
					Cell cell2_3 = row2.createCell(2);
					cell2_3.setCellValue("11111111");
					cell2_3.setCellStyle(style);
				} else {
					System.out.println(f.getType() + "\t");
				}

			}else{
				Class<?> cls=null;
				try {
					cls = Class.forName("com.xukaiqiang.entity.makeloancheck3."+f.getName());
					Field[] fieldObj=cls.getDeclaredFields();
					for (int j = 0; j < fieldObj.length; j++) {
						Field field3=fieldObj[j];
						Row row2 = sheet1.createRow(row+1+j);
						// 第一列
						Cell cell2_1 = row2.createCell(0);
						cell2_1.setCellValue(field3.getName());
						cell2_1.setCellStyle(style);
						// 第二列
						Cell cell2_2 = row2.createCell(1);
						String name = new DBHelper().queryNameByColumn(field3.getName());
						cell2_2.setCellValue(name);
						cell2_2.setCellStyle(style);
						// 第三列
						String type = field3.getType().toString();// 得到此属性的类型
						if (type.endsWith("String")) {
							Cell cell2_3 = row2.createCell(2);
							cell2_3.setCellValue("字段值");
							cell2_3.setCellStyle(style);
						} else if (type.endsWith("int") || type.endsWith("Integer")) {
							Cell cell2_3 = row2.createCell(2);
							cell2_3.setCellValue("11111111");
							cell2_3.setCellStyle(style);
						} else {
							System.out.println(field3.getType() + "\t");
						}
						Cell asdf = row2.createCell(3);
						asdf.setCellValue(f.getName());
						asdf.setCellStyle(style);	
					
					}
					row+=fieldObj.length+2;
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
