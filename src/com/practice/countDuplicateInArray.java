package com.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countDuplicateInArray {

//    Count duplicate using array

//    static void countDuplicates(int arr[], int n){
//        for(int i = 0; i < n; i++){
//            int count = 1;
//            for(int j = i + 1; j < n; j++){
//                if (arr[i] == arr[j]){
//                    i = j;
//                    count++;
//                }
//            }
//            if (count > 1){
//                System.out.println(arr[i]+" "+count);
//            }
//        }
//    }
//    public static void main (String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for(int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
//        Arrays.sort(arr);
//        countDuplicates(arr, n);
//    }



//    count duplicates using hashmap
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int temp = sc.nextInt();
            if(map.containsKey(temp)){
                map.put(temp, map.get(temp)+1);
            }
            else{
                map.put(temp, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){

                System.out.println(entry.getKey()+" "+ entry.getValue());
            }
        }

//        Arrays.sort(arr);
//        System.out.println(map);
//        countDuplicates(arr, n);
    }
}
