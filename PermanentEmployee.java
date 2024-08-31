package com.p3;

public class PermanentEmployee extends Employee{
	private float salary;
	private String addr;
	
	//constructors
	public PermanentEmployee(int empid, String name,float salary, String addr) {
		super(empid, name);//this is the 1st class and the other one is ground--calls base class default constructor.
		this.salary = salary;
		this.addr = addr;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	 public void displayp() {
		displaye();
		System.out.println("Salary: "+ salary+" Address:" + addr);
	}
	
}
