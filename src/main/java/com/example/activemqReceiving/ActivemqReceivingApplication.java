package com.example.activemqReceiving;

import javax.jms.JMSException;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActivemqReceivingApplication 
{
	public static void main(String[] args) throws JMSException 
	{
		JMSMessageReceiver receiver = new JMSMessageReceiver();
		System.out.println("Message recieved from the queue is : "+receiver.recieve());
	}
}
