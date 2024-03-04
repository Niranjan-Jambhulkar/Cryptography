package com.Cryptography;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Intro extends Thread{
	//Thread t = Thread.currentThread();
	public void run() {
		try {
			Thread.sleep(500);
			LocalDateTime today = LocalDateTime.now();
			System.out.println(today);
			for(int i = 0; i<35;i++) {
				System.out.print(" ");
			}
			Thread.sleep(500);
			System.out.println("Welcome");
			System.out.println("Cryptography: - The Caesar Cipher is a simple yet fascinating encryption \ntechnique that dates back to ancient times. It was famously used by \nJulius Caesar to send secret messages to his allies.");
			Thread.sleep(6000);
			System.out.println("Let's Go! Encrypt your first message:)");
			Thread.sleep(2000);
			for(int i = 0; i<35;i++) {
				System.out.print("-");
			}
			System.out.println("\n	Project Cryptography");
			for(int i = 0; i<35;i++) {
				System.out.print("-");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
