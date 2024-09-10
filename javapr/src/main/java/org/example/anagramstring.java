package org.example;

import java.util.Arrays;

public class anagramstring {
    public boolean checkAangrma(String str1, String str2) {
        int n = str2.length();
        int m = str1.length();
        if (m != n) {
         return false;
        }
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);



        return Arrays.equals(arr1,arr2);
    }
}
