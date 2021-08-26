package DSA3_practice.tree;

import java.util.Collections;
import java.util.PriorityQueue;

public class findMedian {
    static PriorityQueue<Integer> leftSmaller = new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer> min = new PriorityQueue<>();
    static double median = 0.0;
    public static double getMedian(int x){
        int size = getSize();
        switch (size){
            case 0:{
                if(x < median){
                    leftSmaller.add(x);
                    median = leftSmaller.peek();
                }
                else{
                    min.add(x);
                    median = min.peek();
                }
                break;
            }
            case 1:{
                if(x < median){
                    min.add(leftSmaller.remove());
                    leftSmaller.add(x);
                }
                else{
                    min.add(x);
                }
                median = (double) (leftSmaller.peek() + min.peek())/2;
                break;
            }
            case -1:{
                if(x < median){
                    leftSmaller.add(x);
                }
                else{
                    leftSmaller.add(min.remove());
                    min.add(x);
                }
                median = (double) (leftSmaller.peek() + min.peek())/2;
                break;
            }
        }
        return median;
    }
    static int getSize(){
        if(leftSmaller.size() == min.size()){
            return 0;
        }
        if(leftSmaller.size() > min.size()){
            return 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {8, 9, 10, 2, 5};
        for(int i = 0; i < arr.length; i++){
            System.out.println(getMedian(arr[i]));
//            max.add(arr[i]);
        }
    }
}
