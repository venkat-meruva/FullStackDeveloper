package com.oops.java;

class Student{
	int sno;
	String name;
	int marks;	
	
Student(int sno, String name, int marks){
	this.sno=sno;
	this.name=name;
	this.marks=marks;
}

void display() {
	System.out.println(sno+ " "+name+ " "+marks);
}

}
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student(111,"Stephen",100);
		Student s2 = new Student(112,"Sher",99);
		s1.display();
		s2.display();

	}

}
