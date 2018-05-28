package com.threading.java;

public class DaemonThread extends Thread{

	public void run() {
		
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Current thread is Deamon");
		}else {
			System.out.println("User Thread is Running");
		}		
	}
	
	public static void main(String[] args) {
		DaemonThread dt = new DaemonThread();
		DaemonThread dt1 = new DaemonThread();
		DaemonThread dt2 = new DaemonThread();
		
		dt.setDaemon(true);
		dt.start();
		dt1.start();
		dt2.start();
	}

}
