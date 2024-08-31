package com.p3;

public class Employee {
private int eid;
private String name;

Employee(){
	System.out.println("Employee()");
}

protected Employee(int eid, String name){
	this.eid = eid;
	this.name = name;
}

public int getEid() {
	//Employee obj = new Employee();
	//obj = null;
	return eid;
}

public void setEid(int eid) {
	this.eid = eid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public void displaye() {
	System.out.println("Employee id: " + eid+" name: " + name );
}
}
