package DSA3_practice.tree;

import java.util.PriorityQueue;

public class minimumCost {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 3, 6};
        PriorityQueue<Integer> hqueue = new PriorityQueue<>();
        for(int i = 0; i < arr.length; i++){
            hqueue.add(arr[i]);
        }
        int cost = 0;
        while (hqueue.size() > 1){
            int h1 = hqueue.remove();
            int h2 = hqueue.remove();
            cost += h1 + h2;
            hqueue.add(h1 + h2);
        }
        System.out.println(cost);
    }
}
