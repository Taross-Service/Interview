package com.taross.interview.notification.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.taross.interview.notification.consumer.ServiceProcessor;
import com.taross.interview.notification.injector.EmailServiceProvider;
import com.taross.interview.notification.injector.MessageServiceProvider;
import com.taross.interview.notification.injector.SmsServiceProvider;

public class NotificationTest {
	private final static ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final static ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final static PrintStream originalOut = System.out;
	private final static PrintStream originalErr = System.err;

	@BeforeAll
	public static void setUpStreams() {
		// Redirect System output stream and error stream
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@BeforeEach
	public void flushStreams() {
		// code executed before each test method
	}

	@Test
	public void testNotifySms() {
		// Test SMS
		MessageServiceProvider messageServiceProvider = new SmsServiceProvider();
		ServiceProcessor processor = messageServiceProvider.getProcessor();

		processor.processMessages("This is a test sms", "0165605485");
		assertEquals(outContent.toString(), "SMS sent to [0165605485] with Message [This is a test sms]");
	}

	@Test
	public void testNotifyEmail() {
		// Test Email
		MessageServiceProvider messageServiceProvider = new EmailServiceProvider();
		ServiceProcessor processor = messageServiceProvider.getProcessor();
		processor.processMessages("Do you find this test interesting?", "tarossservice@gmail.com");
		assertEquals(outContent.toString(),
				"Email sent to [tarossservice@gmail.com] with Message [Do you find this test interesting?]");
	}

	@Test
	public void testNotifyPush() {
		// test Push
		MessageServiceProvider messageServiceProvider = new NotificationServiceProvider();
		ServiceProcessor processor = messageServiceProvider.getProcessor();
		processor.processMessages("What's the benefit of dependency injection?", "tarossservice@gmail.com");
		assertEquals(outContent.toString(),
				"Notification sent to [tarossservice@gmail.com] with Message [What's the benefit of dependency injection?]");

	}

	@AfterEach
	public void tearDown() {
		// Reset output stream
		outContent.reset();
	}

	@AfterAll
	public static void restoreStreams() {
		System.setOut(originalOut);
		System.setErr(originalErr);
	}
}
