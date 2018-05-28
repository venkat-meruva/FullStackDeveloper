package com.threading.java;

public class ThreadNaming extends Thread {

	public void run() {
		System.out.println("Running");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadNaming tn = new ThreadNaming();
		ThreadNaming tn1 = new ThreadNaming();
		System.out.println("Name of first Thread is:"+tn.getName());
		System.out.println("Name of second Thread is :0"+tn1.getName());
		System.out.println("Id of first Thread is :"+tn.getId());
		tn.setName("Display Thread");
		System.out.println("After changing the name of thread tn :"+ tn.getName());

	}

}