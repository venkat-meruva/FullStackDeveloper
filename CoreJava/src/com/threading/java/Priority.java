package com.threading.java;

public class Priority extends Thread{
	
	public void run() {
		System.out.println("Current Running thread Name"+Thread.currentThread().getName());
		System.out.println("Current Running thread Priority:"+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		Priority p1 = new Priority();
		Priority p2 = new Priority();
		p1.setPriority(Thread.MAX_PRIORITY);
		p2.setPriority(Thread.MIN_PRIORITY);
		
		p1.start();
		p2.start();
	}

}
