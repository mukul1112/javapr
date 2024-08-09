package org.example;

import java.util.Arrays;

public class rotate_array {
   public int [] rotation (int[] arr,int d){
//
         int n=arr.length;
//       int [] roTedarr=new int[n];
//       for (int i = 0; i < arr.length; i++) {
//           roTedarr[(i+d)%n]=arr[i];
//       }
//       for (int i = 0; i < arr.length; i++) {
//           arr[i]=roTedarr[i];
//       }
       reverse(0,n-1,arr);
       reverse(0,d-1,arr);
       reverse(d,n-1,arr);
       return arr;
   }
    public void reverse(int start,int end, int[] arr){
       int temp;
            while(start<end){
                temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }

    }
}
