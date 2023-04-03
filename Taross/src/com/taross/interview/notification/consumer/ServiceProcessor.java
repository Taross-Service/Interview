package com.taross.interview.notification.consumer;

public interface ServiceProcessor {

	void processMessages(String message, String recipient);
}
