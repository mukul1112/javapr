package org.example;

// ABCD
//CDAB is rotaion of first
// Append first string with itself ABCDABCDnow check CDAB IS a part of this use indexof
public class isRotatedString {

    public boolean Rotated(String str1, String str2){


        return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);


    }

}
