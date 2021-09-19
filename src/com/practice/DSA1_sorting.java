package com.practice;

public class DSA1_sorting {
    static void bubbleSort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            int max = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[max] > arr[j]){
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
    }
    static void mergeSort(int arr[], int l, int r){
        if(l < r){
            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            mergingArray(arr, l, mid, r);
        }
    }
    static void mergingArray(int arr[], int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i = 0; i < n1; i++){
            L[i] = arr[l + i];
        }
        for(int i = 0; i < n2; i++){
            R[i] = arr[m + 1 + i];
        }
        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 8, 9, 1, 6, 7, 2, 4, 3, 0};
//        bubbleSort(arr);
//        selectionSort(arr);
//        mergeSort(arr, 0, arr.length - 1);
        quickSort(arr, 0, arr.length - 1);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void quickSort(int arr[], int start, int end){
        if(start < end){
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
}
