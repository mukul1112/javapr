package org.example;

public class firstNonRepeatingChar {
     public char nonrepeatingCharacter(String S)
    {
        int n=S.length();
        char[] ch =S.toCharArray();
        int[] freq=new int[26];
        for(int i=0;i<ch.length;i++){
            freq[ch[i]-'a']++;
            System.out.println(ch[i]-'a');
        }
        for(int i=0;i<ch.length;i++){
            if(freq[ch[i]-'a']==1){
                return ch[i];
            }
        }
        return '$';
    }

}
