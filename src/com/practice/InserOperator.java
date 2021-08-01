package com.practice;

import java.util.Scanner;

public class InserOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        long arr[] = new long[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if (((K - arr[i]) == arr[j]) || (K + arr[i]) == arr[j]){
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
//    int solve(int n, int a[], int i, int curr ){
//        if(i==n){
//            if(curr==k){return 1;}
//            return 0;
//        }
//        if(solve(n,a,i+1,curr+a[i])==1){return 1;}
//        return solve(n,a,i+1,curr-a[i]);
//    }
}
