package com.Cryptography;
import javax.swing.plaf.PanelUI;
import java.util.Scanner;

class Alphabet{
    static String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
}

class SwapAlphabet extends Alphabet{
    int num;
    static String[] swap = new String[26];
    public void setNum(int num){
        this.num = num;
    }
    public void Swap() {
        for (int i = num, a = 0; i < 26; i++, a++) {
            swap[a] = super.alphabet[i];
        }
        for (int i = (26-num), a = 0; i < 26; i++, a++) {
            swap[i] = super.alphabet[a];
        }
    }
    public void show(){
        for (int i= 0; i<26; i++) {
            System.out.println(swap[i]);
        }
    }
}

public class Cryptography {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SwapAlphabet sa = new SwapAlphabet();
        sa.setNum(5);
        sa.Swap();
        sa.show();
    }
}
