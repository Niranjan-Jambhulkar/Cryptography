package com.Encrypt;
class Alphabet{
    static String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
}
public class Encrypt extends Alphabet{
    int num;
    String message;
    String[] split = new String[100];
    static String[] swap = new String[26];
    public void setNum(int num){

        this.num = num;
    }
    public void setMessage(String message){

        this.message = message;
    }
    public void stringSplit(){
        for (int i = 0; i<message.length();i++){
            split[i] = String.valueOf(message.charAt(i));
        }
        for (int i = 0; i<message.length(); i++){
            System.out.println(split[i]);
        }
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
        
    }
}

