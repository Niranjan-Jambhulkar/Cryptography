package com.Cryptography;

public class Intro extends Thread{
	//Thread t = Thread.currentThread();
	public void run() {
		try {
//			System.out.println("Welcome");
			Thread.sleep(1500);
			for(int i = 0; i<35;i++) {
				System.out.print("-");
			}
			System.out.println("\n	Project Cryptography");
			for(int i = 0; i<35;i++) {
				System.out.print("-");
			}
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
