package com.practice;

public class findMissingNoInArray {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 6, 7, 9};
        int j = 0;
        for(int i = 1; i < 10; i++){
            if(arr[j] != i){
                System.out.println(i);
            }else {
                j++;
            }
        }
    }
}
