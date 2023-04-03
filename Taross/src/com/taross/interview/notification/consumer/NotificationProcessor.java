package com.taross.interview.notification.consumer;

import com.taross.interview.notification.service.MessageService;

public class NotificationProcessor implements ServiceProcessor {

	private MessageService service;

	public NotificationProcessor(MessageService service) {
		this.service = service;
	}

	public NotificationProcessor() {}

	public void setService(MessageService service) {
		this.service = service;
	}

	@Override
	public void processMessages(String message, String recipient) {
		// do some msg validation, manipulation logic etc
		this.service.sendMessage(message, recipient);
	}

}
