package com.practice;

import java.util.Scanner;

public class zeroWindow {
    static void zeroWindow(int n, int k, String s){
        int finalCount = 0;
        for(int i = 0; i < n; i++){
            int inc = 0, count = 0;
            for(int j = 0; j < k; j++){
                if((i + j) < n){
                    if(s.charAt(i + j) == '0'){
                        count++;
                    }
                }
                else{
                    System.out.println(finalCount);
                    return;
                }
            }
            if ((k - count) <= count){
                finalCount++;
            }
        }
        System.out.println(finalCount);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        zeroWindow(n, k, s);
    }
}
