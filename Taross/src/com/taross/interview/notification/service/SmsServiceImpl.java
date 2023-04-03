package com.taross.interview.notification.service;

public class SmsServiceImpl implements MessageService {

	@Override
	public void sendMessage(String message, String recipient) {
		// logic to send SMS
		System.out.print("SMS sent to [" + recipient + "] with Message [" + message + "]");
	}

}