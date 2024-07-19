package org.example;

// abcd@#$

public class specialCharacter {

    public int specialCharacter(String str){
        int count=0;
        String specialCharacterRemoved= "";
        for (int i=0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))){
                count++;
            }
            else {
                specialCharacterRemoved =specialCharacterRemoved+str.charAt(i);

            }
        }

        System.out.println(specialCharacterRemoved);
        return count;
    }

}
