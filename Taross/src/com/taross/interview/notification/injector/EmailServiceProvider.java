package com.taross.interview.notification.injector;

import com.taross.interview.notification.consumer.ServiceProcessor;
import com.taross.interview.notification.consumer.NotificationProcessor;
import com.taross.interview.notification.service.EmailServiceImpl;

public class EmailServiceProvider implements MessageServiceProvider {

	@Override
	public ServiceProcessor getConsumer() {
		NotificationProcessor app = new NotificationProcessor();
		app.setService(new EmailServiceImpl());
		return app;
	}

}
