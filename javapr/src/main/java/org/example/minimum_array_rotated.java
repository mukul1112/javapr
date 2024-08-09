package org.example;

public class minimum_array_rotated {
    public int minimum(int[] arr){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int minAns=Integer.MAX_VALUE;
        while (low<=high){
            int mid=(low+high)/2;
            if(arr[low]<arr[mid]){
                minAns=Math.min(arr[low],minAns);
                low=mid+1;
            }else{
                high=mid-1;
                minAns=Math.min(arr[mid],minAns);
            }
        }
        return minAns ;
    }

}
