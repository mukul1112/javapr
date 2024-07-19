package org.example;

public class halfUpperHalflower {

    public String halfupperhalflower( String str){

        String newstr="";
        StringBuilder upperCase= new StringBuilder();
        StringBuilder loweCase= new StringBuilder();

        int mid=str.length()/2;

        for (int i=0;i<str.length();i++) {
            if (i < mid) {
                loweCase.append(str.charAt(i));
            } else {
                upperCase.append(str.charAt(i));
            }
        }
        newstr= loweCase.toString().toLowerCase()+ upperCase.toString().toUpperCase();
        return newstr;
    }

}
