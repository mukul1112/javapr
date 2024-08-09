package org.example;

//[24,12,13,14]

public class secondmax {

    public int secondMax(int[] arr){

        int max=arr[0];
        int Smax=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            } else if (max>arr[i]&&Smax<arr[i] ) {
                Smax=arr[i];
            }

        }

        return Smax;
    }

}
