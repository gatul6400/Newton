package com.practice;

import java.util.Scanner;

public class WeekendContestNonContigiousArray {
            static int mod = (int)1e9+7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int u = sc.nextInt();
        int arr[] = new int[n];
        while(u-- > 0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int k = sc.nextInt();
            int p = sc.nextInt();
            binarySearch(arr, l, r, k, p);
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void binarySearch(int[] arr, int l, int r, int k, int p) {
        int start = l;
        int end = r;
        int key = k;
        if(k < l) {
            key = (1 + l/k) * k;
            if(key > r){
                return;
            }
        }
       while(start <= end){
           int mid = start + (end - start) / 2;
           if(mid == key){
               if(l % k == 0){
                   for(int i = l; i <= r; i = i + k){
                       arr[i - 1] = (arr[i - 1] + p) % mod;
                   }
               }
               else{
                   for(int i = mid; i <= r; i = i + k) {
                       arr[i - 1] = (arr[i - 1] + p) % mod;
                   }
               }
               return;
           }
           else if(mid < key){
               start = mid + 1;
           }
           else {
               end = mid - 1;
           }
       }
    }
}
