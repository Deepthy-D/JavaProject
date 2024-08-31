package com.p8;

import java.util.Arrays;


class Department{
	private int id;
	private String deptname;
	private String hod_name;
	
	//constructor
	public Department(int id, String deptname, String hod_name) {
		this.id = id;
		this.deptname = deptname;
		this.hod_name = hod_name;
	}

	//setter, getter methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getHod_name() {
		return hod_name;
	}

	public void setHod_name(String hod_name) {
		this.hod_name = hod_name;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", deptname=" + deptname + ", hod_name=" + hod_name + "]";
	}
	
	
}


class University{
	String name;
	String address;
	Department depts[];
	
	//constructor
	public University(String name, String address, Department[] depts) {
		super();
		this.name = name;
		this.address = address;
		this.depts = depts;
	}

	//setter getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Department[] getDepts() {
		return depts;
	}

	public void setDepts(Department[] depts) {
		this.depts = depts;
	}

	@Override
	public String toString() {
		return "University [name=" + name + ", address=" + address + ", depts=" + Arrays.toString(depts) + "]";
	}
	
}


public class CompositionEg {
public static void main(String[] args) {
	//create atleast two departments, 
	Department dept1 = new Department(134, "ECE", "Arya");
	Department dept2 = new Department(235, "CSE", "Anusha");
	
	Department dArr[] =  new Department[2];
	dArr[0] = dept1;
	dArr[1] = dept2;
	
	
	//and set those 2 departments to University object
	University u = new University("John", "AddressLane", dArr);
	
	//display university object
	System.out.println(u.toString());
}
}
