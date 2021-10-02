package practiceAlgo;

import java.util.*;

public class arrayAndQueries {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        List <Integer> arr = new ArrayList<>();
//        int n = sc.nextInt();
        int n = 3;
//        int m = sc.nextInt();
        int m = 3;
        for(int i = 0; i < n; i++){
            arr.add(i + 1);
//            arr.add(sc.nextInt());
        }
        while(m-- > 0){
            int type = sc.nextInt();
//            int type = 1;
            int i = sc.nextInt();
//            int i = 2;
//            int j = 4;
            int j = sc.nextInt();
            if(type == 1){
                funcType1(n, arr, i-1, j, 0);
            }else{
                funcType2(n, arr, i-1, j, arr.size() - 1, i - 1);
            }
        }
        System.out.println(arr);
    }
    static void funcType1(int n, List<Integer> arr, int i , int j , int index){
        // int startIndex = 0;
        if(i == j){
            return;
        }
//        swap(arr, i, index);
        int temp = arr.remove(i);
        arr.add(index, temp);
        System.out.println(arr);
        funcType1(n, arr, i + 1, j, index + 1);
    }

    static void funcType2(int n, List<Integer> arr, int i , int j , int index, int len){
        // int startIndex = 0;
        if(len == j){
            return;
        }
        int temp = arr.remove(i);
        arr.add(index, temp);
//        swap(arr, i, index);
        funcType2(n, arr, i, j, index, len + 1);
    }

    static void swap(List<Integer> arr, int i, int j){
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
}
