package org.example;


public class binary_search {
    public int binary_search1(int[] arr,int k){
        int low=0;
        int high=arr.length-1;
        while(high>=low){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                return mid;
            }
            if(arr[mid]>k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }


        }

      return -1;
    }
}
