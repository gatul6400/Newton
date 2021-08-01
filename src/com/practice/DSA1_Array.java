package com.practice;
import java.util.*;

public class DSA1_Array {
    static void maxFrequency(int arr[]){
        Arrays.sort(arr);
        int maxCount = 0;
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    i = j;
                    count++;
                }
            }
            if(maxCount <= count){
                maxCount = count;
                index = i;
            }
        }
        System.out.println(arr[index]);
    }
    static void duplicatesInArray(int arr[]){
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    i = j;
                    count++;
                }
            }
            if(count > 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
    static void kSumElement(int arr[]){
        int k = 3;
        for(int i = 0; i < arr.length; i++){
            int inc = i, start = 0, temp = 0;
            for(int j = i; j < k + i; j++){
                if(arr.length > j){
                    temp += arr[j];
                }
                else{
                    temp += arr[start];
                    start++;
                }
            }
            System.out.print(temp+" ");
        }
    }
    public static void main(String[] args) {
//        5
//        1 4 2 4 5
        int arr[]= {1, 2, 4, 2, 5, 4, 4, 5, 5};
//        kSumElement(arr);
        duplicatesInArray(arr);
//        maxFrequency(arr);
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
    }
}
