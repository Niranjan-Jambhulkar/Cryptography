package com.Cryptography;
import java.util.Scanner;
import com.Encrypt.*;


public class Cryptography {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Encrypt sa = new Encrypt();
        System.out.print("Enter Key: ");
        sa.setNum(sc.nextInt());
        sa.swap();
        System.out.print("Enter Message: ");
        sa.setMessage(sc.next());
        sa.stringSplit();
        sa.encrypt();
    }
}
