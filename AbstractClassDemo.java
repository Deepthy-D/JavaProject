package com.p7;

abstract class Animal{
	int legs;
	String name;
	abstract void move();
	
	Animal(String name, int legs){
		//super();
		this.legs=legs;
		this.name=name;		
	}
	
	public void animaldetails() {
		System.out.println("Animal name is " +name + " and have " +legs + " legs");
	}
}
//Concrete class (non-abstract class)
class Snake extends Animal{

	Snake(String name, int legs) {
		super(name, legs);
	}

	void move() {
		System.out.println("Crawling.....");
	}
	
}

public class AbstractClassDemo {
	public static void main(String[] args) {
		Animal obj = new Snake("Lion", 4);
			obj.animaldetails();
	} 
}
