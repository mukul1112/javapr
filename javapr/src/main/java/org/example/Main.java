package org.example;


import recursion.factorial;
import recursion.product;
import stream.averageofinteger;
import stream.employee;
import stream.partioning;
import stream.sumarizing;

import java.util.*;

public class Main  {
    public static void main(String[] args) {
//        palindrome palindrome=new palindrome();
//        boolean flag=palindrome.isPalindrome("abcba");
//        System.out.println(flag);

//        reveseString rs=new reveseString();
//        String reversed=rs.reveseString("kulul");
//        System.out.println(reversed);

//        averageofinteger avg=new averageofinteger();
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        avg.average(numbers);

//        fibbonaci fib=new fibbonaci();
//        List<Integer> list=fib.fibbonachi(5);
//        System.out.println(list);

//              StringSub str=new StringSub();
//              str.Substring("aabe");
////
//        List<String> string =str.substrings("abc");
//        List<String> strings = str.substrings("abcd");
//        System.out.println(strings);
//        System.out.println(strings.toArray().length);
//

//          specialCharacter sc=new specialCharacter();
//        int count = sc.specialCharacter("abcdef@#$%^&");
//        System.out.println(count);

//        isRotatedString rotatedString=new isRotatedString();
//        boolean rotated = rotatedString.Rotated("ABCD", "CDAB");
//        System.out.println(rotated);

        // find missing from natural number
//        MissingNumber missingNumber=new MissingNumber();
//        int[] a =new int[]{1,2,3,4,6,7,8,5,10};
//        int i = missingNumber.missing_num(a, 10);
//        System.out.println(i);

//   halfUpperHalflower str=new halfUpperHalflower();
//        String str1 = str.halfupperhalflower("mukulmukul");
//        System.out.println(str1);
//
//     arr_num_product product=new arr_num_product();
//     int[] arr={1,2,3,4,5};
//    List<Integer> list= product.prod(arr);
//        System.out.println(list);
//
//        secondmax sc=new secondmax();
//        int[] arr={10,12,34,14};
//        int i = sc.secondMax(arr);
//        System.out.println(i);

//        duplicatenumber dc = new duplicatenumber();
//        int[] arr = {1, 2, 3, 4, 5, 5, 6, 7, 3, 4, 2, 4, 5};
//        List<Integer> duplicate = dc.duplicates(arr);
//        System.out.println(duplicate);
////
//
//        int[] arr={1,2,3,4,5};
//        binary_search bs=new binary_search();
//        int i = bs.binary_search1(arr,9);
//        System.out.println(i);

//        int[] arr={10,10,10};
//        inversionCount inc=new inversionCount();
//        int count = inc.count(arr);
//        System.out.println(count);


//        int[] arr={1,2,3,4,5};
//        rotate_array rt=new rotate_array();
//        int[] rotation = rt.rotation(arr, 3);
//        for (int i = 0; i < rotation.length; i++) {
//            System.out.println(rotation[i]);

//        int[] arr={4,5,6,7,0,1,2};
//        sorted_roted_array srbs=new sorted_roted_array();
//        int searching = srbs.searching(arr, 0);
//        System.out.println(searching);

//        product prod=new product();
//        int products = prod.products(10, 4);
//        System.out.println(products);

//        fibbonaci fibbonaci = new fibbonaci();
//        fibbonaci.fibbonachi(7);

//            factorial fc=  new factorial();
//        int factorial = fc.factorial(6);
//        System.out.println(factorial);

//        anagramstring an=new anagramstring();
//        boolean b = an.checkAangrma("bat", "tab");
//        System.out.println(b);
//        int x=5;
//        int y=--x;
//        System.out.println(y);
//        System.out.println(x);
//        System.out.println(x+""+y);


//        firstNonRepeatingChar fr=new firstNonRepeatingChar();
//        char ch = fr.nonrepeatingCharacter("yy");
//        System.out.println(ch);
        //AddTwoArrayAsNumber add= new AddTwoArrayAsNumber();
//        int[] arr={8,3,4};
//        int[] arr2={1,4,1};
//
//        int[] ints = add.sumofdArray(arr, arr2);
//


//
//        List<employee> emplist=new ArrayList<>();
//        emplist.add(new employee("mukul",23,4500));
//        emplist.add(new employee("mukul",22,43445));
//        emplist.add(new employee("mukul",21,4556));
//
//        System.out.println(emplist.toString());
//        Optional<employee> first = emplist.stream().max(Comparator.comparingDouble(e->e.salary));
//        System.out.println(first.toString());

        List<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(6);
        partioning part=new partioning();
        sumarizing sumarry =new sumarizing();
        IntSummaryStatistics summarystaus = sumarry.summarystaus(list);
        System.out.println(summarystaus.getAverage());
        Map<Boolean, List<Integer>> partion = part.partion(list);
        System.out.println(partion);

    }



}