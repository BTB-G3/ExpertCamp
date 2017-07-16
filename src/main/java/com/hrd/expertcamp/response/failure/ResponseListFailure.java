package com.hrd.smey.response.failure;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.hrd.smey.response.Pagination;
import com.hrd.smey.response.ResponseHttpStatus;
import com.hrd.smey.response.ResponseList;



/**
 * 
 * @author Mom Raksmey
 *
 */
public class ResponseListFailure<T> extends ResponseList<T> {
	public Error error;
	public ResponseListFailure(String message, boolean status, Pagination pagination, ResponseHttpStatus error) {
		super.setMessage(message);
		super.setStatus(status);
		this.setError(new Error(error));
		super.setData(Collections.emptyList());
		
	}
	public ResponseListFailure() {
		// TODO Auto-generated constructor stub
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
