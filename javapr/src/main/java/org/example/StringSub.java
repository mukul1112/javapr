package org.example;

import java.util.ArrayList;
import java.util.List;

public class StringSub {
    //ab= a,b,ab=3
    //abc= a,b,c,ab,bc,abc,ac=7
    //abcd=a,b,c,d,ab,ac,ad,bc,bd,cd,abc,abd,bcd,abcd=

    public List<String> substrings(String str) {
        List<String> String = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            StringBuilder stringbuilder=new StringBuilder();
            for (int j=i;j<str.length();j++){
                stringbuilder.append(str.charAt(j));
                String.add(stringbuilder.toString());
            }

        }
        return String;
    }

    public void Substring(String str){

        for (int i = 0; i < str.length(); i++) {
            String str1=str.substring(i);
            System.out.println(str1
            );
        }
    }

}
