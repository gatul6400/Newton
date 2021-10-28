package practiceAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class luckyBoyAssignment {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
//        int boys = sc.nextInt();
        int boys = 10;
//        int toys = sc.nextInt();
        int toys = 10;
//        long k = sc.nextLong();
        long k = 5;
//        long boysArr[] = new long[boys];
        long boysArr[] = {37, 62, 56, 69, 34, 46, 10, 86, 16, 49};
        Arrays.sort(boysArr);
        // long toysArr[] = new long[toys];
//        ArrayList<Long> toysArr = new ArrayList<>();
        ArrayList<Integer> toysArr = new ArrayList<>(Arrays.asList(50, 95, 47, 43, 9, 62, 83, 71, 71, 7));
        Collections.sort(toysArr);
//        ArrayList<Long> toysArr = new ArrayList<Long>(Arrays.asList("xyz", "abc"));;

//        for(int i = 0; i < boys; i++){
//            boysArr[i] = sc.nextLong();
//        }
//
//        for(int i = 0; i < toys; i++){
//            // toysArr[i] = sc.nextLong();
//            toysArr.add(sc.nextLong());
//        }



        int count = 0;
        for(int i = 0; i < boys; i++){
            if(toysArr.size() <= 0){
                break;
            }
            count += getCount(toysArr, boysArr[i] - k, boysArr[i] + k);
        }
        System.out.println(count);
    }


    // static int getCount(long arr, long start, long end){
    static int getCount(ArrayList<Integer> arr, long start, long end){
        // int count = 0;
        for(int i = 0; i < arr.size(); i++){
            if(start <= arr.get(i) && arr.get(i) <= end){
                arr.remove(arr.get(i));
                return 1;
            }
        }
        return 0;
        // return count;
        // if(start < end){
        // 	long mid = (end - start) / 2 + start;
        // 	if(arr.contains(mid)){
        // 		arr.remove(mid);
        // 		return 1;
        // 	}
        // 	else if(mid )
        // }
    }
}
