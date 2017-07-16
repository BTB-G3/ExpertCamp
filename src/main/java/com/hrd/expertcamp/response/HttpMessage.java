package com.hrd.smey.response;
/**
 * 
 * @author Mom Raksmey created date: 06/july/2017
 *
 */
public class HttpMessage {
	public static String success(String objectName, String Transaction){
		return objectName+" have been "+Transaction+" successfully";
	}
	public static String fail(String objectName, String Transaction){
		return objectName+" have not been "+Transaction+" successfully";
	}
}
