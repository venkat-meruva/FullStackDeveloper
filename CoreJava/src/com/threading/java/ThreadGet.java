package com.threading.java;

public class ThreadGet extends Thread{

	public void run() {
		System.out.println("Current Thread Name is:"+ Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadGet tg = new ThreadGet();
	tg.start();	
	}

}
