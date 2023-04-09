package com.taross.interview.notification.injector;

import com.taross.interview.notification.consumer.ServiceProcessor;

public interface MessageServiceProvider {

	public ServiceProcessor getProcessor();
}
