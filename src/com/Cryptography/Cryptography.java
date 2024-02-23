package com.Cryptography;
import java.util.Scanner;
import com.Encrypt.*;


public class Cryptography {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner message = new Scanner(System.in);
        Encrypt sa = new Encrypt();
        System.out.print("Enter Key: ");
        sa.setNum(sc.nextInt());
        sa.swap();
        System.out.print("Enter Message: ");
        sa.setMessage(message.nextLine());
        sa.stringSplit();
        sa.setAlphabet();
        sa.encrypt();
    }
}
