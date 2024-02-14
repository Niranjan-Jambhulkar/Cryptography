package com.Cryptography;
import javax.swing.plaf.PanelUI;
import java.util.Scanner;

class Alphabet{
    static String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
}

class SwapAlphabet extends Alphabet{
    int num;
    String message;

    String[] message1 = new String[100];
    static String[] swap = new String[26];
    public void setNum(int num){
        this.num = num;
    }
    public void setMessage(String message){
        this.message = message;
    }

    public void stringSplit(){
        message1 = message.split("0");
    }
    public void swap() {
        for (int i = num, a = 0; i < 26; i++, a++) {
            swap[a] = super.alphabet[i];
        }
        for (int i = (26-num), a = 0; i < 26; i++, a++) {
            swap[i] = super.alphabet[a];
        }
    }
    public void encrypt(){
        for (String x : message1){
            System.out.println(x);
        }
    }
}

public class Cryptography {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SwapAlphabet sa = new SwapAlphabet();
        System.out.print("Enter Key: ");
        sa.setNum(sc.nextInt());
        sa.swap();
        System.out.print("Enter Message: ");
        sa.setMessage(sc.next());
        sa.stringSplit();
        sa.encrypt();
    }
}
