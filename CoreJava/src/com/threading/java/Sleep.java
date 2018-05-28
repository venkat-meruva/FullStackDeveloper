package com.threading.java;

public class Sleep extends Thread {


	public void run() {
		for(int i=0;i<=5;i++) {
			try {Thread.sleep(500);
			}catch(InterruptedException e)		
			{
				System.out.println(e);
				}
//			finally {
//				System.out.println("Hello");
//			}
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sleep s1 = new Sleep();
		s1.start();
//		Thread t1 = new Thread(s1);
//		t1.start();
	}

}
