package com.oops.java;

class Car{
	
	int installments =25; 
	void speed() {
		System.out.println("Highest Speed of the car is 180m/hr");
	}
	
	void mileage() {
		System.out.println("Mileage of the car is 25m/hr");
	}
}
 class Audi extends Car {
	 
	void price() {
		System.out.println("The Price of the car is $400000");
	}
 }
 	public class Inheritance  {

	public static void main(String[] args) {
		
		Audi a1 = new Audi();
		
		a1.speed();
		a1.mileage();
		a1.price();
	}

}
