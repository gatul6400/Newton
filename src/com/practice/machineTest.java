package com.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class machineTest {
    static void ques1(){
        int a = 9;
        int b = 21;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
    static void ques2(){
        int n = 3;
        for(int i = 0; i < n; i++){
            for (int j = n-i; j >= 1; j--){
                System.out.print(" ");
            }
            for(int k = 0; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n-1; i>0; i--){
            for(int j = i; j <= n; j++){
                System.out.print(" ");
            }
            for (int j = i - 1; j>=0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static int removeDuplicate(int arr[], int n){
        if(n == 0 || n == 1){
            return n;
        }
        int temp[] = new int[n];
        int j = 0;
        for (int i = 0; i < n-1; i++){
            if(arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        for (int i = 0; i < j; i++){
            arr[i] = temp[i];
        }
        return j;
    }
    public static void main(String[] args) {
        int arr[] = {5, 1, 5, 4, 3, 2, 4, 1};
        Arrays.sort(arr);
        int n = arr.length;
        ques2();
//        n = removeDuplicate(arr, n);
//        int largestValue = 0;
//        int secondLargestValue = 0;
//        for(int i = 0; i < n; i++){
//            if (largestValue < arr[i]){
//                secondLargestValue = largestValue;
//                largestValue = arr[i];
//            }
//            else if (secondLargestValue < arr[i]){
//                secondLargestValue = arr[i];
//            }
//        }
//        System.out.println(largestValue+"  "+secondLargestValue);
    }
}
