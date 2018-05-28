package com.exception.java;

public class Finallaze {

	
	public void display() {
		System.out.println("It si running ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Finallaze f1 = new Finallaze();
		Finallaze f2 = new Finallaze();
		
		f1=null;
		f2=null;
		System.gc();
		
	}

}
