package org.example;

public class mergeSort {

    public void sort( int[] arr, int l,int r){
        if(l<r){

            int mid=l+(r-l)/2;
         //left
            sort(arr,l,mid);
         //right
            sort(arr,mid+1,r);
        //  merge
            merge(arr,l,mid,r);

        }
    }

    public void  merge(int[] arr, int l , int m, int r){
         int n1=m-l+1;
        int  n2=r-m;

        int left[]=new int[n1];
        int right[]=new int[n2];

        for (int i = 0; i <n1 ; i++) {
            left[i]=arr[l+i];
        }
        for (int i = 0; i <n2 ; i++) {
            right[i]=arr[m+1+i];
        }
          int i=0,j=0,k=l;
       while(i<n1&&j<n2){
           if(left[i]<right[i]){
               arr[k]=left[i];
               i++;k++;
           }else {
               arr[k]=right[i];
               j++;
               k++;
           }
       }
       while (i<n1){
           arr[k]=left[i];
           i++;k++;
       }
       while (j<n2){
           arr[k]=left[i];
           i++;k++;
       }

    }

}
