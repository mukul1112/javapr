package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class fibbonaci {

    // 0 1 1 2 3 5 8 13  fibbonaci logic

//    [0]=0
//    [1]=1
//    [2]=0+1=1
//    [3]=1+1=2
//    [4]=2+1=3
//    [5]=2+3=5
//    [6]=3+5=8
//    [n]=[n-1]+[n-2]

    public List<Integer> fibbonachi(int n){

        List<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(1);
        for(int i=0;i<n-1;i++){

            System.out.println(list.get(i));
            list.add(list.get(i)+list.get(i+1));

        }

        return list;
    }

}
