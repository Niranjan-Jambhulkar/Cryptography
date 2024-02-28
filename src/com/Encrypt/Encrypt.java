package com.Encrypt;
import com.Alphabet.Alphabet;
public class Encrypt extends Alphabet{
    int key;
    String message;
    StringBuilder encryptMessage = new StringBuilder();
    StringBuilder swaped = new StringBuilder();

    public void swap() {
        swaped.append(alphabet.substring(key,26));
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
    
    public void encrypt(){
        for (int i = 0; i<message.length(); i++){
            char a = message.charAt(i);
            String b = Character.toString(a);
            int index = alphabet.indexOf(b);
            char c = swaped.charAt(index);
            encryptMessage.append(c);
        }
        System.out.println("Encrypted Message: "+ encryptMessage);
    }
    
    public void clear() {
    	int l = encryptMessage.length();
        encryptMessage.delete(0, l);
        swaped.delete(0, 27);
        alphabet.deleteCharAt(26);
    }

}

