package interview;

import java.util.Scanner;

public class DSA2Interview2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,5,5,5,6,6,7,8,8,9,9,9,9};
        int target = sc.nextInt();
        int count = 0;
        int first = 0, last =0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                if (count == 0){
                    first = i;
                }
                last = i;
                count++;
            }
        }
        System.out.println(first+"   "+last);
    }
}
