package com.ach.redtool.service.common;

import java.util.ArrayList;
import java.util.List;

public class ResponseDto {
	
	private final List<MessageDto> message = new ArrayList<MessageDto>();
	
	public ResponseDto() {
	}

	public void addMessage(MessageDto messageDto) {
		message.add(messageDto);
	}
}
