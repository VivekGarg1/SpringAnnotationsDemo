package com.home.model;

import org.springframework.beans.factory.annotation.Required;

public class Message {
	
	private String message;
	private int messageId;
	public String getMessage() {
		return message;
	}
	
	@Required
	public void setMessage(String message) {
		this.message = message;
	}
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

}
