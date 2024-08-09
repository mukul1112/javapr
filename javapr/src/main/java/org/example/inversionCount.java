package org.example;

public class inversionCount {
    public int count(int[] arr){
        int countie=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    countie++;
                }
            }
        }

        return  countie;
    }

}
