package org.example;

public class reveseString {

    public String reveseString(String str){

        String reverseString = "";

        for(int i=0;i<str.length();i++){
            reverseString+=str.charAt(str.length()-i-1);
        }

        return reverseString;
    }

}
