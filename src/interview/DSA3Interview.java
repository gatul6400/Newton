package interview;

import java.util.PriorityQueue;
import java.util.Scanner;

public class DSA3Interview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2, 3, 15, 5, 4, 45, 80, 6, 150, 77, 120};
        int x = sc.nextInt();
        getElement(arr, arr.length, x);
    }
    static void getElement(int arr[], int n, int x){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i = 0; i < n; i++){
            queue.add(arr[i]);
        }
        for(int i = 0; i < n; i++){
            if(queue.peek() < x){
                System.out.print(queue.remove()+" ");
            }
            else{
                break;
            }
        }
    }
}
