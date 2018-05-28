package com.threading.java;

public class ThreadRunnable implements Runnable{

	public void run() {
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ThreadRunnable tr = new ThreadRunnable();
		//tr.run();

		Thread t1= new Thread(tr);
		
		t1.start();
		//t1.start(); we can't start thread twice,, it leads to IllegalThreadStateException
}}
