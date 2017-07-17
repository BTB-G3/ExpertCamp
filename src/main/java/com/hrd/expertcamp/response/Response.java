package com.hrd.expertcamp.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Mom Raksmey
 *
 * @param <T>
 */
public class Response<T> {
	@JsonProperty("message")
	private String message;
	@JsonProperty("status")
	private boolean status;
	
	public Response() {
		// TODO Auto-generated constructor stub
	}
	public Response(String message, boolean status) {
		super();
		this.message = message;
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}
