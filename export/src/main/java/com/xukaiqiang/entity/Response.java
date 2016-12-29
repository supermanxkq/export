package com.xukaiqiang.entity;

import java.util.List;

public class Response<T> {
	private List<T> list;

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

}
