package org.example;
//arr=[1,2,3,4,5] now make another arry with product of other index element
//[2*3*4*5,1*3*4*5,1*2*4*5,1*2*3*4]
//


import java.util.ArrayList;
import java.util.List;

//
public class arr_num_product {

    public List<Integer> prod ( int[] arr){
        List<Integer> list=new ArrayList<>();

        for (int i=0;i<arr.length;i++){
            int prod = 1;
            for (int j=0;j<arr.length;j++){
                if(j!=i){
                    prod*=arr[j];
                }

            }
            list.add(prod);
        }


        return list;
    }
}
