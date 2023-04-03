package com.taross.interview.notification.service;

public class EmailServiceImpl implements MessageService {

	@Override
	public void sendMessage(String msg, String rec) {
		// logic to send email
		System.out.print("Email sent to [" + rec + "] with Message [" + msg +"]");
	}

}