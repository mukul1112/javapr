package org.example;


// searching
//[4,5,6,7,0,1,2] ,target=6
public class sorted_roted_array {
    public int searching(int[] arr,int target){
          int n =arr.length;
          int l =0;
          int h=n;
        while(l<=h) {
            int m=(l+h)/2;
            if(arr[m]==target) return m;
            //check sorted half
            if(arr[m]>arr[l]){
                 if(arr[l]<=target&&target<=arr[m]){
                     h=m-1;
                 }else {
                     l=m+1;
                 }
            }
            else{
                  if(arr[m]<=target&&target<=arr[h]){
                      l=m+1;
                  }
                  else {
                      h=m-1;
                  }
            }
        }
        return -1;
    }


}
