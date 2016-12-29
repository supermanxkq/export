package com.xukaiqiang.bean;

import java.util.List;

/**
 * 数据库列实体
 * 
 * @author Yinglong Xu
 * @date 2012-2-16
 */
public class Column {
	
	/**
	 * 字段名
	 */
	private String name;
	/**
	 * 字段名：java风格，驼峰式
	 */
	private String nameJ;
	
	/**
	 * 字段备注、注释
	 */
	private String remark;

	/**
	 * 默认构造
	 */
	public Column() {
	}

	/**
	 * 构造
	 * @param type 
	 * @param name 
	 * @param nameJ 
	 */
	public Column( String name, String nameJ) {
		this.name = name;
		this.nameJ = nameJ;
	}
	
	/**
	 * 全构造
	 * @param type
	 * @param name
	 * @param nameJ
	 * @param remark
	 */
	public Column(String name, String nameJ, String remark) {
		this.name = name;
		this.nameJ = nameJ;
		this.remark = remark;
	}


	/**
	 * 获取列名
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置列名
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取javastyle列
	 * @return String
	 */
	public String getNameJ() {
		return nameJ;
	}

	/**
	 * 设置javastyle列
	 * @param name
	 */
	public void setNameJ(String nameJ) {
		this.nameJ = nameJ;
	}

	/**
	 * 获取备注
	 * @return String
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 设置备注
	 * @param name
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
