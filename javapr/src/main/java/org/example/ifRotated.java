package org.example;

public class ifRotated {
    public boolean rotated (int[] arr){
        int n=arr.length;
        int count=0;
        for (int i = 0; i < n; i++) {
            if(arr[i-1]>arr[i]){
                count++;
            }

        }
        if(arr[n-1]>arr[0]){
            count++;
        }
        return count<=1;
    }

}
