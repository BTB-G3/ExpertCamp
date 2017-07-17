package com.hrd.expertcamp.response;
/**
 * 
 * @author Mom Raksmey created date: 07/06/2017
 *
 */
public enum ResponseHttpStatus {
	
	
	OK(200, "Success!, Everything is working"),
	SUCCESS_RETRIEVED_RECORD(201,"Retrieves a specific record"), 
	SUCCESS_RETRIEVED_LIST_OF_RECORDS(202, "Retrieves a list of records"),

	// POST 201x
	SUCCESS_CREATED(201, "New record has been created successfully"), 

	// PUT/PATCH/DELETE 202x
	SUCCESS_UPDATED(221, "The specific record was successfully updated"),
	SUCCESS_DELETED(222, "The specific record was successfully daleted"),

	// --- 4xx Client Error ---
	// POST 400x
	BAD_REQUEST(400,"The request was invalid or cannot be served. The exact error should be explained in the error payload. E.g. „The JSON is not valid"),
	FAIL_CREATED(4001, "Unable to create record"),
	FAIL_DELETED(4001,"Unable to delete record"), 
	FAIL_UPDATED(4001,"Unable to update record"), 
	OPERATION_FAIL(4000, "Operation failed"),

	// GET/DELTE 404x
	NOT_FOUND(404, " There is no resource behind the URI"), 
	RECORD_NOT_FOUND(404,"Record(s) not found"),

	// --- 5xxx Server Error ---
	// Internal Server Error - HTTP Response Code: 500x
	INTERNAL_SERVER_ERROR(500, "Something is broken. Please contact to developers team!");
	
	private int key;
	private String value;
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	private ResponseHttpStatus() {
	}
	private ResponseHttpStatus(int key, String value) {
		this.key = key;
		this.value = value;
	}
	
}
