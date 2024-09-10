package org.example;
// leftmost=count(arr,k,1)
//rightmoast=count(arr,k,0)
public class countOfDuplicate {

    public int count(int[] arr, int k,boolean flag){

        int n=arr.length;
        int low=arr[0];
        int high=arr[n-1];
        int res=-1;
        while(low<=high){
            int mid=low+high/2;
            if(arr[mid]==k){
                res=mid;
                if(flag){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            if(arr[mid]>=k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;
    }

}
