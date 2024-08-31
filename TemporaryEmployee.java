package com.p4;

import com.p3.Employee;

public class TemporaryEmployee extends Employee{
	private float hourlypay;
	private String company_addr;

	public TemporaryEmployee(int eid, String name, float hourlypay, String company_addr) {
		super(eid, name);
		this.hourlypay = hourlypay;
		this.company_addr = company_addr;
	}
	
	public void display() {
		displaye();
		System.out.println("Hourly Pay is " + hourlypay + " and Company address is " +company_addr);
	}

}
