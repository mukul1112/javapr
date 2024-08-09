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

    public List<Integer> duplicate(int[] arr){
        ArrayList<Integer> list=new ArrayList<>();
//


//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 0; j < arr.length; j++) {
//                if(arr[i]==arr[j]&&i!=j){
//                    list.add(arr[i]);
//                }
//
//            }
//
//        }
//
//        Set<Integer> set = new HashSet<>(list);
//        ArrayList<Integer>List1= new ArrayList<>(set);
//        if(List1.isEmpty())
//        {
//            List1.add(-1);
//
//        }
        int n=arr.length;
        List<Integer> list1 = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list1.add(0);
        }
        for (int i = 0; i < arr.length; i++) {

            list1.add(arr[i],1);
        }
        return list1;
    }
}
