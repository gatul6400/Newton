package interview;

import java.util.Arrays;

public class interview25 {
    public static void binarySearch(int arr[], int x){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(arr[mid] == x){
                System.out.println("Found" + x);
                return;
            }
            else if(arr[mid] < x){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        System.out.println("Not Found" + x);
    }
}
//1,2,