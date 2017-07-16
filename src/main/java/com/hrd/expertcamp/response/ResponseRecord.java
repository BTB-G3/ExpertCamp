package com.hrd.smey.response;
/**
 * 
 * @author Mom Raksmey
 *
 */
public class ResponseRecord<T> extends Response {

	public ResponseRecord() {
		// TODO Auto-generated constructor stub
	}
	public ResponseRecord(String message, boolean status, T data) {
		super(message, status);
		this.data=data;
	}
	private T data;
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
}
