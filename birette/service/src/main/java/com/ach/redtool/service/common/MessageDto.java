package com.ach.redtool.service.common;

import java.util.HashMap;

public class MessageDto {
	
	private final HashMap<String, Object>  map = new HashMap<String, Object>();
	private  String message =null ;
	
	public MessageDto() {
	}
	public MessageDto(String message) {
		this.message =message;
	}
	
	public void addMessage(String key, String value) {
		map.put(key, value);
	}
	
	public void addMessage(String key, Boolean value) {
		map.put(key, value);
	}
	
	public void addMessage(String key, Object value) {
		map.put(key, value);
	}
	
	public String getMessage() {
		return message;
	}
	
}
