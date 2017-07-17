package com.hrd.expertcamp.response;

import java.util.List;

public class ResponseList<T> extends Response{

	

	public ResponseList(String message, boolean status, List<T> data, Pagination pagination) {
		super(message, status);
		this.data=data;
		this.pagination=pagination;
	}

	public ResponseList() {
		super();
	}

	private List<T>  data;
	private Pagination pagination;

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
	
	
}
