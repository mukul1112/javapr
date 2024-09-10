package org.example;

public class missing_num_inSEquence {

    public int missing(int [] arr){
        int num,s,sum = 0;
        int n=arr.length;
        int a=arr[0];
        int l=arr[n-1];
        s=(n+1)*(a+l)/2;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
      num=s-sum;
        return num;
    }
}
