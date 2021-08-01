package com.practice;

public class DSA1_string {
    public static void main(String[] args) {
//        String s = "Hello my name is atul gupta";
//        String str[] = s.split(" ");
//        for(int i = 0; i < str.length; i++){
//            String s1 = new StringBuffer(str[i]).reverse().toString();
//            System.out.print(s1+" ");
//        }
//        for(int i = str.length - 1; i >= 0; i--){
//            System.out.print(str[i]+" ");
//        }
        int n = 3;
        for(int i = 0; i < n; i++){
            for(int j = n - i; j > 0; j--){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n - 1; i > 0; i--){
            for(int j = i; j <= n; j++){
                System.out.print(" ");
            }
            for (int k = i - 1; k >= 0; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
