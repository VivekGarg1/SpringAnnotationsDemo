package com.home.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.home.model.Message;


public class ClientWithRequiredAnnotation {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("BeansUsingRequired.xml");
		Message message = context.getBean("message", Message.class);
		System.out.println(message.getMessageId()+"\t"+message.getMessage());
		context.close();
	}

}
