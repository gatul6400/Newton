package com.practice;

import java.util.Scanner;

public class removeDuplicateFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- > 0){
            String s = sc.next();
            System.out.println("");
            for(int i = 0; i < s.length(); i++){
                int count = 0;
                for(int j = i + 1; j < s.length(); j++){
                    if(s.charAt(i) == s.charAt(j)){
                        count++;
                    }
                }
                if(count <= 0){
                    System.out.print(s.charAt(i));
                }
            }
            System.out.println("");
        }
    }
}
