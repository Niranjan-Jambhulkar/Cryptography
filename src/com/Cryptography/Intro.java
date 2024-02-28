package com.Cryptography;

public class Intro extends Thread{
	//Thread t = Thread.currentThread();
	public void run() {
		try {
			Thread.sleep(1000);
			for(int i = 0; i<35;i++) {
				System.out.print("-");
			}
			System.out.println("\n	Project Cryptography");
			for(int i = 0; i<35;i++) {
				System.out.print("-");
			}
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
