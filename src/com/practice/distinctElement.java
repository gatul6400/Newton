package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class distinctElement {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
//        int arr[] = new int[n];
        int arr[] = {1, 2, 1, 3, 4, 2, 3, 5};
//        for(int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }

        ArrayList<Integer> result = new ArrayList<>();

        int check = k - 1;
        for (int i = 0; i <= arr.length - k; i++){
            int count = 1;
            for(int j = i+1; j <= check; j++){
                if(arr[i] != arr [j]){
                    count++;
                }
            }
            check++;
            result.add(count);
        }
        System.out.println(result);
    }
}
