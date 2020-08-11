package com.home.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.home.model.Employee;
import com.home.model.Pancard;
import com.home.model.UserDetails;


public class ClientWithComponentAnnotation {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("BeansUsingComponent.xml");
		UserDetails details = context.getBean("userBean", UserDetails.class);
		System.out.println(details.getUserName()+"\t"+details.getPassword());
		context.close();
	}

}
