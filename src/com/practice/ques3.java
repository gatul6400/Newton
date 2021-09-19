package com.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ques3 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 5, 4, 3, 2, 4, 1, 1};
        Arrays.sort(arr);
        int n = arr.length;
        ArrayList <Integer> temp = new ArrayList<>();
//        int temp[] = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    i = j;
                    break;
                }
                else{
                    temp.add(arr[i]);
                    break;
                }
            }
        }
        System.out.println(temp);

//        int largestValue = 0;
//        int secondLargestValue = 0;
//        for(int i = 0; i < temp.size(); i++){
//            if (largestValue < temp.get(i)){
//                secondLargestValue = largestValue;
//                largestValue = temp.get(i);
//            }
//            else if (secondLargestValue < temp.get(i)){
//                secondLargestValue = temp.get(i);
//            }
//        }
//        System.out.println(largestValue+"  "+secondLargestValue);
    }
}
