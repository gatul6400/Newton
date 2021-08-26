package DSA3_practice.tree;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class maxQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> hqueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++){
            hqueue.add(sc.nextInt());
        }
        int q = sc.nextInt();
        while(q-- > 0){
            int x = sc.nextInt();
            if(x == 1){
                hqueue.add(sc.nextInt());
            }
            else {
                System.out.println(hqueue.peek());
            }
        }
    }
}
