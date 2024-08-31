package com.p5;

import com.p3.PermanentEmployee;
import com.p4.TemporaryEmployee;

public class MainProgram {
public static void main(String[] args) {
	PermanentEmployee pobj = new PermanentEmployee (111, "Janakai", 145.6f, "Land Street");
	
	pobj.displayp();
	
	//create object of Temporary Employee and call display() method.
	TemporaryEmployee ptemp = new TemporaryEmployee (112, "Sharon", 23.87f, "Land Street");
	ptemp.display();
}
}
