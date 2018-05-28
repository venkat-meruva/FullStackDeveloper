package com.oops.java;


class Employee{
int id;
String name;
int salary;

  public void insert(int id, String name, int salary) {
this.id=id;
this.name=name;
this.salary=salary;
 }
 
  public void display() {
	 System.out.println(id+" "+name+" "+salary+" ");
 }
}
public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.insert(101, "sachin", 1000);
		e1.display();
		e2.insert(102, "Sehwag", 20000);
		e2.display();
		
	}
}