package DSA3_practice.tree;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class chocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {7, 5, 1};
        int k = 3;
        PriorityQueue<Integer> pqueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < arr.length; i++){
            pqueue.add(arr[i]);
        }
        int sum = 0;
        for(int i = 0; i < k; i++){
            int temp = pqueue.remove();
            sum += temp;
            pqueue.add(temp/2);
        }
        System.out.println(sum);
    }
}
