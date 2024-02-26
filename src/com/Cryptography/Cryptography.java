package com.Cryptography;
import java.util.Scanner;
import com.Encrypt.*;
import com.Decrypt.Decrypt;


public class Cryptography {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner message = new Scanner(System.in);
        Encrypt sa = new Encrypt();
        Decrypt dc = new Decrypt();
        System.out.println("1. Encrypt Message\n2. Decrypt Message");
        System.out.print("Select: ");
        int a = sc.nextInt();
        switch (a){
            case 1:
                System.out.print("Set Key: ");
                sa.setNum(sc.nextInt());
                sa.swap();
                System.out.print("Enter Message: ");
                sa.setMessage(message.nextLine());
                sa.setSpace();
                sa.encrypt();
                break;

            case 2:
                System.out.print("Enter Key: ");
                dc.setNum(sc.nextInt());
                dc.swap();
                System.out.print("Enter Message: ");
                dc.setMessage(message.nextLine());
                dc.setSpace();
                dc.decrypt();
                break;
        }
    }
}
