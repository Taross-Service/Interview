package com.taross.interview.notification.injector;

import com.taross.interview.notification.consumer.ServiceProcessor;
import com.taross.interview.notification.consumer.NotificationProcessor;
import com.taross.interview.notification.service.SmsServiceImpl;

public class SmsServiceProvider implements MessageServiceProvider {

	@Override
	public ServiceProcessor getProcessor() {
		NotificationProcessor app = new NotificationProcessor();
		app.setService(new SmsServiceImpl());
		return app;
	}

}
