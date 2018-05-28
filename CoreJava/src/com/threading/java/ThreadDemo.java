package com.threading.java;

public class ThreadDemo extends Thread{

	
	public void run() {
		System.out.println("Execution started");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ThreadDemo t1 = new ThreadDemo();
	t1.start();
	t1.run();
	
	}

}
