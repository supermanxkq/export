package com.xukaiqiang.entity;

public class Folder {
	private String id;
	private String  name;
	private String description;
	private String []  order;
	private String owner;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String[] getOrder() {
		return order;
	}
	public void setOrder(String[] order) {
		this.order = order;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
}
