package com.practice;

public class Interview {
    public static void main(String[] args) {
        String s = "atul gupta";
        String rev = "";
        for(int i = s.length() - 1; i >= 0 ; i--){
           rev += s.charAt(i);
//           char ch = s.charAt(i);
//
//           String temp = "" + ch;
//           rev += temp;
//            System.out.println(temp);
        }
//        System.out.println();
        System.out.println(rev);
    }
}
