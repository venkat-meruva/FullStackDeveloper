package com.threading.java;

public class Joins extends Thread{

	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(500);
				}
			catch(Exception e) {
					System.out.println(e);
				}System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Joins j1 = new Joins();
		Joins j2 = new Joins();
		Joins j3 = new Joins();
		j1.start();
		try {
			j1.join(1500);
		}catch(Exception e)
				{System.out.println(e);
				}
		j2.start();
		j3.start();
	}

}
