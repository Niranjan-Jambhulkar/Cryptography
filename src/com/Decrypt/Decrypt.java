package com.Decrypt;

import com.Alphabet.Alphabet;

public class Decrypt extends Alphabet {
    int key;
    String message;
    StringBuilder decryptMessage = new StringBuilder();
    StringBuilder swaped = new StringBuilder();

    public void swap() {
        swaped.append(alphabet.substring(key,36));
        swaped.append(alphabet.substring(0,key));
    }

    public void setSpace(){
        alphabet.append(" ");
        swaped.append(" ");
    }
    public void setNum(int key){
        this.key = key;
    }
    public void setMessage(String m){
        this.message = m;
        message = message.toUpperCase();
    }
    public void decrypt(){
        for (int i = 0; i<message.length(); i++){
            char a = message.charAt(i);
            String b = Character.toString(a);
            int index = swaped.indexOf(b);
            char c = alphabet.charAt(index);
            decryptMessage.append(c);
        }
        System.out.println("Decrypted Message: "+ decryptMessage);
    }
    
    public void clear() {
    	int l = decryptMessage.length();
    	decryptMessage.delete(0, l);
        swaped.delete(0, 27);
        alphabet.deleteCharAt(26);
    }
}
