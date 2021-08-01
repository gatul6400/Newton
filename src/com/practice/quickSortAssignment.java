package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class quickSortAssignment {
    static void printArray(int arr[]){

        for(int i = 0; i < arr.length; ++i){
            if(arr[i] % 2 == 0){
                int start = 0;
                int end = arr.length;
                while (start < end)
                {
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                }
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void quickSort(int arr[], int start, int end){
        if (start < end){
            int pivotPosition = partition(arr, start, end);
            quickSort(arr, start, pivotPosition - 1);
            quickSort(arr, pivotPosition + 1, end);
        }
    }
    static int partition(int arr[], int start, int end){
        int pivot = arr[end];
        int pivotPosition = start - 1;
        for(int i = start; i < end; i++){
            if(arr[i] < pivot){
                pivotPosition++;
                int temp = arr[pivotPosition];
                arr[pivotPosition] = arr[i];
                arr[i] = temp;
            }
        }
        pivotPosition++;
        int temp = arr[pivotPosition];
        arr[pivotPosition] = arr[end];
        arr[end] = temp;
        return pivotPosition;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int arr[] = new int[size];
            for(int i = 0; i < size; i++){
                arr[i] = sc.nextInt();
            }
            quickSort(arr, 0, size - 1);

            int evenArr[] = new int[size];
            int oddArr[] = new int[size];
            ArrayList <Integer> eArr = new ArrayList<>();
            ArrayList <Integer> oArr = new ArrayList<>();

            for(int i = 0; i < size; i++){
                if(arr[i] % 2 == 0){
                    eArr.add(arr[i]);
                }
                else{
                    oArr.add(arr[i]);
                }
            }
            for(int i = oArr.size() - 1;i >= 0; i--){
                System.out.print(oArr.get(i)+" ");
            }
            for(int i = 0; i < eArr.size(); i++){
                System.out.print(eArr.get(i)+" ");
            }
    }
}
