package DSA3_practice.tree;

import java.util.Collections;
import java.util.PriorityQueue;

public class median {
    static PriorityQueue<Integer> max = new  PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer> min = new  PriorityQueue<>();
    static double mid = 0.0;
    static double getMedian(int x){
        int size = getSize();
        switch (size){
            case 0: {
                if(x > mid){
                    min.add(x);
                    mid = min.peek();
                }
                else{
                    max.add(x);
                    mid = max.peek();
                }
                break;
            }
            case 1:{
                if(x > mid){
                    min.add(x);
                }
                else{
                    min.add(max.remove());
                    max.add(x);
                }
                mid = (double)(min.peek() + max.peek())/2;
                break;
            }
            case -1:{
                if(x > mid){
                    max.add(min.remove());
                    min.add(x);
                }
                else{
                    max.add(x);
                }
                mid = (double) (min.peek() + max.peek())/2;
                break;
            }
        }
        return mid;
    }
    static int getSize(){
        if(max.size() == min.size()){
            return 0;
        }
        if(max.size() > min.size()){
            return 1;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int arr[] = {8, 9, 10, 2, 5};
        for(int i =0; i< arr.length; i++){
            System.out.println(getMedian(arr[i]));
        }
    }
}
