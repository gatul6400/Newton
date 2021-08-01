package com.practice;

import java.util.Scanner;

public class stringManipulation {
    static void reverseCharacter(String s){
        String str = new StringBuffer(s).reverse().toString();
        System.out.println(str);
    }
    public static void main(String[] args) {
//        Input: Hello World, This is Me
//        Output: Me is This, World Hello
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        reserveString(str);
        reverseCharacter(str);
    }
    static void reserveString(String str){
        String s[] = str.split(",");
        for(int i = s.length - 1; i >= 0; i--){
            String s1[] = s[i].trim().split(" ");
            for(int j = s1.length - 1; j >= 0; j--){
                System.out.print(s1[j]+" ");
            }
            System.out.print("\b, ");
        }
            System.out.print("\b\b");
    }
}
