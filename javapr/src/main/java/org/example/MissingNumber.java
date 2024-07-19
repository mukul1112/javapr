package org.example;

// find missing natural number
//sum of number is (n*n+1)/2
// sumof number-sumarray
//caluclate it

public class MissingNumber {

    public int missing_num(int [] a, int n){

       int sumofnumber=n*(n+1)/2;
       int sumOfArray=0;
       for (int i=0;i<a.length;i++){
        sumOfArray+=a[i];
       }

        return sumofnumber-sumOfArray;
    }
}
