package com.hrd.expertcamp.response.failure;

import com.hrd.expertcamp.response.Response;
import com.hrd.expertcamp.response.ResponseHttpStatus;

public class ResponseFailure<T> extends Response<T>{
	private Error error;
	
	public ResponseFailure(String message, boolean status, ResponseHttpStatus error) {
		super.setMessage(message);
		super.setStatus(status);
		this.setError(new Error(error));
	
		
	}

	public static class Error {

		private int code;
		private String message;
		
		public Error(ResponseHttpStatus status) {

			super();
			this.code = status.getKey();
			this.message = status.getValue();
		}

		public int getCode() {
			return code;
		}
		
		public void setCode(int code) {
			this.code = code;
		}
		
		public String getMessage() {
			return message;
		}
		
		public void setMessage(String message) {
			this.message = message;
		}
	}
	
	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}
	

}
