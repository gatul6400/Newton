package com.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DSA_2_practice {
//    static void bubbleSort(int arr[], int n){
//        for(int i = 0; i < n - 1; i++){
//            for(int j = i + 1; j < n; j++){
//                if(arr[i] > arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//    }
//    static void selectionSort(int arr[], int n){
//        for(int i = 0; i < n - 1; i++){
//            int max = i;
//            for(int j = i + 1; j < n; j++){
//                if(arr[j] < arr[max]){
//                    max = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[max];
//            arr[max] = temp;
//        }
//    }
//
//    static void quickSort(int[] arr, int l, int r) {
//        if(l < r){
//            int piPos = partition(arr, l, r);
//            quickSort(arr, l, piPos - 1);
//            quickSort(arr, piPos + 1, r);
//        }
//    }
//    static int partition(int[] arr, int l, int r) {
//        int pivot = arr[r];
//        int piPos = l - 1;
//        for(int i = l; i < r; i++){
//            if(arr[i] < pivot){
//                piPos++;
//                int temp = arr[i];
//                arr[i] = arr[piPos];
//                arr[piPos] = temp;
//            }
//        }
//        piPos++;
//        int temp = arr[piPos];
//        arr[piPos] = arr[r];
//        arr[r] = temp;
//        return piPos;
//    }
//
//    static void mergeSort(int[] arr, int l, int r) {
//        if(l < r){
//            int mid = l + (r - l) / 2;
//            mergeSort(arr, l, mid);
//            mergeSort(arr, mid + 1, r);
//            merge(arr, l, mid, r);
//        }
//    }
//    static void merge(int[] arr, int l, int m, int r) {
//        int n1 = m - l + 1;
//        int n2 = r - m;
//        int L[] = new int[n1];
//        int R[] = new int[n2];
//        for(int i = 0; i < n1; i++){
//            L[i] = arr[l + i];
//        }
//        for(int i = 0; i < n2; i++){
//            R[i] = arr[m + 1 + i];
//        }
//        int i = 0, j = 0, k = l;
//        while(i < n1 && j <n2){
//            if(L[i] < R[j]){
//                arr[k] = L[i];
//                i++;
//            }
//            else{
//                arr[k] = R[j];
//                j++;
//                int count = (m + 1) - (l - i);
//            }
//            k++;
//        }
//        while(i < n1){
//            arr[k] = L[i];
//            i++;
//            k++;
//        }
//        while(j < n2){
//            arr[k] = R[j];
//            j++;
//            k++;
//        }
//    }
//
    public static void main(String[] args) {
//        int arr[] = {9,7,5,3,1,8,6,4,2,0};
//        bubbleSort(arr, 10);
//        selectionSort(arr, 10);
//        mergeSort(arr, 0,  9);
//        quickSort(arr, 0, 9);
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }


//        LinkedList<Integer> ll = new LinkedList<>();
//        ll.add(10);
//        ll.add(100);
//        ll.add(1000);
//        ll.add(10000);
//        ll.add(100000);
//        ll.add(1000000);
//        System.out.println(ll);
//        Queue<Integer> bfs = new LinkedList<>();
//        Stack<Integer> stk = new Stack<>();


    }
}
