package com.p8;


class Vehicle{
	
}

class Car extends Vehicle{
	
}

class Bus extends Vehicle{
	
}


//resolved the null pointer error
public class VehicleArray {

	public static void main(String[] args) {
		
	  Vehicle vehicle [] = new Vehicle[5];
      vehicle[0] = new Vehicle();
      vehicle[1] = new Car();
      vehicle[2] = new Bus();

	}

}