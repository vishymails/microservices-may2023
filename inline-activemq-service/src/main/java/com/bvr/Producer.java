package com.bvr;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;



@Component
public class Producer implements CommandLineRunner {

	public Producer() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;
	
	
	@Autowired
	public Queue queue;

	
	public void send(String msg) {
		this.jmsMessagingTemplate.convertAndSend(this.queue, msg);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		send("JMS Message from Oracle Blr");
		
		System.out.println("Producer task completed");
	}
	
	

}
