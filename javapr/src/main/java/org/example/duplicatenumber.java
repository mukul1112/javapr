package org.example;

import java.util.*;

//Given an array arr of size n which contains elements in rangefrom 0 to n-1,
//you need to find all the elements occurring
//more than once in the given array.
//Return the answer in ascending order. If no such element is found, return list containing [-1].
//Input: n = 5, arr[] = [2,3,1,2,3]
//Output: 2 3
//Explanation: 2 and 3 occur more than once in the given array.
public class duplicatenumber {
    public  ArrayList<Integer> duplicates(int[] arr) {
        // code here
        ArrayList<Integer> List1=new ArrayList<>();
        int[] arr1 = new int[arr.length];

        for(int i=0;i<arr1.length;i++){
            arr1[i]=0;
        }
        for(int i=0;i<arr.length;i++){
            arr1[arr[i]]++;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>1)
            {
                System.out.println(i+"  "+arr1[i]);
                List1.add(i);
            }
        }
        return List1;
    }

}
