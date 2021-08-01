package com.practice;

import java.util.Scanner;

public class GamingOfLove {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long n1 = sc.nextLong();
//        long n2 = sc.nextLong();
//
//        System.out.println(Math.abs(n1 - n2)+" value check ");
//        if(Math.abs(n1 - n2) == 1 || n1 == n2){
//            System.out.println("Aniket");
//        }
//        else{
//            System.out.println("Swapnil");
//        }
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        int d = 4;

        for(int k = 0; k < d; k++){
            int tem2 = arr[0];
            int i = 0;
            for(int j = 1; j < n; j++){
                arr[i] = arr[j];
                i++;
            }
            arr[i] = tem2;
        }


        for(int j = 0; j < n; j++){
            System.out.print(arr[j]+" ");
        }

//        System.out.println();
    }
}
