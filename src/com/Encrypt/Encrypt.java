package com.Encrypt;

import java.util.LinkedList;

class Alphabet{
    static String[] alphabetArray = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
}
public class Encrypt extends Alphabet{
    int num;
    String message;
    String[] split = new String[100];
    static String[] swap = new String[26];
    LinkedList alphabet = null;
    StringBuilder swaped = new StringBuilder();
    StringBuilder encryptMessage = new StringBuilder();
    LinkedList stringSplit = null;

    public void swap() {
        for (int i = num, a = 0; i < 26; i++, a++) {
            swap[a] = super.alphabetArray[i];
        }
        for (int i = (26-num), a = 0; i < 26; i++, a++) {
            swap[i] = super.alphabetArray[a];
        }
    }

    public void setAlphabet(){
        alphabet = new LinkedList();
        for (int i =0 ; i <alphabetArray.length;i++){
            alphabet.add(alphabetArray[i]);
        }
        alphabet.add(26," ");

        for (int i =0 ; i <alphabetArray.length;i++){
            swaped.append(swap[i]);
        }
        swaped.append(" ");
    }
    public void setNum(int num){
        this.num = num;
    }
    public void setMessage(String m){
        this.message = m;
        message = message.toUpperCase();
    }
    public void stringSplit(){
        for (int i = 0; i<message.length();i++){
            split[i] = String.valueOf(message.charAt(i));
        }
        stringSplit = new LinkedList();
        for (int i =0 ; i <message.length();i++){
            stringSplit.add(split[i]);
        }

    }
    public void encrypt(){
        for (int i = 0; i<message.length(); i++){
//            if (){
//
//            }
            char a = message.charAt(i);
            String b = Character.toString(a);
            int index = alphabet.indexOf(b);
            char c = swaped.charAt(index);
            encryptMessage.append(c);
        }
        System.out.println("Encrypted Message: "+ encryptMessage);
    }
}

