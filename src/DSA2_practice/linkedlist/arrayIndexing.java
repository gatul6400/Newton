package DSA2_practice.linkedlist;

import java.util.Scanner;

public class arrayIndexing {
    public static void main(String[] args) {
//        arr = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
//        System.out.println(k);
        int arr[] = new int[n];
        int count = 0;
        int kIndex = 0;
        int fisrt = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == target){
                if(count == 0){
                    fisrt = i;
                }
                kIndex = i;
                count++;
            }
        }
        System.out.println("First Occurence of k is "+target+" : "+ fisrt);
        System.out.println("Second Occurence of k is "+target+" : "+ kIndex);

    }
}
