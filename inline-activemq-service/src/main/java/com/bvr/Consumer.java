package com.bvr;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	public Consumer() {
		// TODO Auto-generated constructor stub
	}
	
	
	@JmsListener(destination = "sample.queue")
	public void receiveQueueMessage(String text) {
		System.out.println("Output : \n");
		System.out.println("Reply Captured from Producer : " + text);
		System.out.println("Consumer's Job Done ");
	}

}
