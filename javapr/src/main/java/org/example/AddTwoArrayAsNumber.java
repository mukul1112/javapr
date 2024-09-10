package org.example;

import java.util.Arrays;

public class AddTwoArrayAsNumber {

    public int [] sumofdArray(int[] arr1, int [] arr2){

        int n=arr1.length;
        int m=arr2.length;
        int l=Math.max(n,m);
        int [] sumArr=new  int[l+1];
        int sum=0;
        int carry=0;
        int i,j,k;
        for ( i = n-1,j=m-1,k=l;  k>0; i--,j--,k--) {
            sum=carry;
            if(i>=0){
                sum+=arr1[i];
            }
            if(j>=0){
                sum+=arr2[j];
            }

            sumArr[k]=sum%10;
            carry=sum/10;
        }
//     sumArr[0]=carry;
//        if(sumArr[0]==0){
//            int [] ans=new int[l];
//            System.arraycopy(sumArr, 1, ans, 0, l);
//           return ans;
//        }
//        for (int o = 0; o < sumArr.length; o++) {
//            System.out.println(sumArr[o]);
//        }
        if(carry!=0){
            sumArr[0]=carry;
        }

   return sumArr;
    }

}
