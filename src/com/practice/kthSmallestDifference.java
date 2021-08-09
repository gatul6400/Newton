package com.practice;

//import java.util.Arrays;
import java.util.*;
import java.io.*;
import java.lang.*;

public class kthSmallestDifference {
//    public static void main(String[] args) {
//        int arr[] = {1, 3, 4, 1, 4, 8};
//        int k = 2;
//        System.out.println(getKthCountDiff(arr, k));
//    }
//    static int getKthCountDiff(int arr[], int k){
//        Arrays.sort(arr);
//        int l = 0;
//        int h = arr[arr.length - 1] - arr[0];
//        while (l < h){
//            int midDiff = l + (h - l) / 2;
//            if(countDiff(arr, midDiff) < k){
//                l = midDiff + 1;
//            }
//            else{
//                h = midDiff;
//            }
//        }
//        return h;
//    }
//    static int countDiff(int arr[], int k){
//        int result = 0;
//        int j = 0;
//        for(int i = 1; i < arr.length; i++){
//            while(j < i && arr[i] - arr[j] >k){
//                j++;
//            }
//            result += (i-j);
//        }
//        return result;
//    }
//}


//class Main{
//    Jayesh Gave this method
    public static void main(String[] args)throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {

            String str[] = read.readLine().trim().split(" ");

            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);

            int arr[] = new int[n];
            str = read.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(str[i]);
            System.out.println(Math.abs(small(arr, k)));
        }
    }

    public static int small(int arr[], int k) {
        Arrays.sort(arr);
        int l = 0, r = arr[arr.length - 1] - arr[0];
        while (r > l) {
            int mid = l + (r - l) / 2;
            if (count(arr, mid) < k) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return r;
    }

    public static int count(int arr[], int mid) {
        int ans = 0, j = 0;
        for (int i = 1; i < arr.length; ++i) {
            while (j < i && arr[i] - arr[j] > mid) {
                ++j;
            }
            ans += i - j;
        }
        return ans;
    }
}
