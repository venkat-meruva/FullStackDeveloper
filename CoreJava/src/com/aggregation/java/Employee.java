package com.aggregation.java;

public class Employee {
	
		int id;
		String name;
		Address address;
	
	public Employee(int id, String name, Address address){
			this.id=id;
			this.name=name;
			this.address=address;
		}
	
	void display() {
		System.out.print(id+" "+name);
System.out.println(" ");
		System.out.println(address.city+" "+address.state+"  "+address.country);
	}
	public static void main(String[] args) {

		Address a1 = new Address("Baton Rouge", "Louisnian","USA");
		Address a2 = new Address("Des Moines", "Iowa", "USA");

	Employee e1= new Employee(101,"Miller",a1);
	Employee e2 = new Employee(102,"Stephen",a2);	
	System.out.println("Here, we are using concept of aggregation for the class Address using as Object in another Class");
	e1.display();
	e2.display();
	}
}
