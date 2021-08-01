package com.practice;

import java.util.Scanner;

public class inverseCount {
    static int inverseCount(int a[]){
        int count = 0;
        for(int i = 0; i < a.length; i++){
            int max = Integer.MIN_VALUE;
            for(int j = i + 1; j < a.length; j++){
                if(a[i] > a[j]){
                    int tem = a[i];
                    a[i] = a[j];
                    a[j] = tem;
                    count++;
                }
            }
        }
        return count;
    }
//    public static void main (String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for(int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(inverseCount(arr));
//    }


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        // System.out.println(inverseCount(arr));
        int count = 0;
        count += sort(arr, 0, arr.length - 1);
        System.out.println(count);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int sort(int a[], int l, int r){
        int count = 0;
        if(l<r){
            int m = (r + l) / 2;
            count += sort(a, l, m);
            count += sort(a, m + 1, r);
            count += merge(a, l , m, r);
        }
//        System.out.println(count+ " count");
        return count;
    }

    static int merge(int a[], int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i = 0; i < n1; i++){
            L[i] = a[l + i];
        }
        for(int i = 0; i < n2; i++){
            R[i] = a[m + 1 + i];
        }

        int i = 0, j = 0, k = l, count = 0;

        while (i < n1 && j < n2){
            if (L[i] <= R[j]){
                a[k] = L[i];
                i++;
//                count++;
            }
            else{
                a[k] = R[j];
                j++;
                count += (m + 1) - (l + i);
//                count++;
            }
            k++;
        }

        while (i < n1){
            a[k] = L[i];
            i++;
            k++;
//            count++;
        }
        while (j < n2){
            a[k] = R[j];
            j++;
            k++;
//            count++;
        }
        return count;
    }
}
