package com.home.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.home.model.Employee;
import com.home.model.Pancard;


public class ClientWithResourceAnnotation {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("BeansUsingResource.xml");
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee.getEmployeeId()+"\t"+employee.getEmpName());
		Pancard pancard = employee.getPancard();
		System.out.println(pancard.getPanNo()+"\t"+pancard.getPanHolderName());
		context.close();
	}

}
