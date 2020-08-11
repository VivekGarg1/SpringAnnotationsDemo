package com.home.model;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component//Employee employee=new Employee();
public class Employee {
	
	/*
	 * private int employeeId; private String empName;
	 */
	
	//@Component annotation implementation
	@Value("1")
	private int employeeId;
	
	@Value("Vivek Garg")
	private String empName;
	
	@Autowired
	//@Qualifier("pancard2")
	//@Resource(name = "pancard2")
	//@Resource
	private Pancard pancard;

	/*
	 * @Autowired(required = false) public Employee(int employeeId, String empName,
	 * Pancard pancard) { super(); this.employeeId = employeeId; this.empName =
	 * empName; this.pancard = pancard; }
	 */
	
	

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setPancard(Pancard pancard) {
		this.pancard = pancard;
	}

	public String getEmpName() {
		return empName;
	}

	public Pancard getPancard() {
		return pancard;
	}

}
