package com.practice;

import java.util.Scanner;

public class theDice {
    static void opposite(int n){
        switch (n){
            case 1:
                System.out.println(6);
                break;
            case 2:
                System.out.println(5);
                break;
            case 3:
                System.out.println(4);
                break;
            case 4:
                System.out.println(3);
                break;
            case 5:
                System.out.println(2);
                break;
            case 6:
                System.out.println(1);
                break;
            default:
                System.out.println("Not a valid Move");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        opposite(n);
        maximumMarks(n);
        reverseFirstTwo(n);
    }
    static void maximumMarks(int n){

        if (n >= 5){
            System.out.println(n);
        }
        else{
            System.out.println(10 - n);
        }
    }
    static void reverseFirstTwo(int n){
        n = n/100;
        int result = 0;
        while(n>0){
            result = result * 10 + n%10;
            n = n/10;
        }
        System.out.println(result);
    }
    long arr[] = new long[5];
    long arrr[] = new long[5];
}
