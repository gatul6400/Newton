package com.practice;

import java.util.Scanner;

public class rotateArray {
    static void rotate(int arr[], int n, int d){
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
    }
    static void  kCircleSum(int arr[],int n,int k){
        int tem = arr[0];
        for(int i = 0; i < n; i++){
            int inc = i, start = 0;
            int tem1 = 0;
            for(int j = 0; j < k; j++){
                if(n > inc){
                    tem1 += arr[inc];
                    inc++;
                }
                else{
                    tem1 += arr[start];
                    start++;
                }
            }
//            arr[i] =
            System.out.print(tem1+" ");
        }

//        for(int i = 0; i < n; i++){
//            System.out.print(arr[i]+" ");
//        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-- > 0){
            int n = sc.nextInt();
            int d = sc.nextInt();
            int arr[] = new int[n];
//            System.out.println(n);
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
//            rotate(arr, n, d);

            kCircleSum(arr, n, d);
        }
    }
}
