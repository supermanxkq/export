package com.xukaiqiang.bean;

/**
 * @ClassName: DataDTO
 * @Description: 数据传输对象
 * @author xukaiqiang
 * @date 2016年12月10日 下午4:34:18
 * @modifier
 * @modify-date 2016年12月10日 下午4:34:18
 * @version 1.0
 */

public class DataDTO {
	private String db_name;
	private String java_name;
	private String parent_name;
	private String data_type;
	private String remarks;

	public String getDb_name() {
		return db_name;
	}

	public void setDb_name(String db_name) {
		this.db_name = db_name;
	}

	public String getJava_name() {
		return java_name;
	}

	public void setJava_name(String java_name) {
		this.java_name = java_name;
	}

	public String getParent_name() {
		return parent_name;
	}

	public void setParent_name(String parent_name) {
		this.parent_name = parent_name;
	}

	public String getData_type() {
		return data_type;
	}

	public void setData_type(String data_type) {
		this.data_type = data_type;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public DataDTO(String db_name, String java_name, String parent_name, String data_type, String remarks) {
		super();
		this.db_name = db_name;
		this.java_name = java_name;
		this.parent_name = parent_name;
		this.data_type = data_type;
		this.remarks = remarks;
	}

	public DataDTO() {
		super();
	}

}
