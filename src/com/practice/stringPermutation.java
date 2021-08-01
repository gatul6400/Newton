package com.practice;

import java.util.Arrays;

public class stringPermutation {

//    static String swap(String str, int i, int j){
//        char[] charArr = str.toCharArray();
//        char temp = charArr[i];
//        charArr[i] = charArr[j];
//        charArr[j] = temp;
//        return String.valueOf(charArr);
//    }
//    static void permute(String str, int l, int r){
//        if(l == r){
//            System.out.print(str+" ");
//        }
//        else{
//            for(int i = l; i <= r; i++){
//                str = swap(str, l, i);
//                permute(str, l+1, r);
//                str = swap(str, i, l);
//            }
//        }
//    }


    public static void permute(String str){
        char[] temp = str.toCharArray();
        // Step 1. Sort the string
        Arrays.sort(temp);
        System.out.println("String " + String.valueOf(temp));
        int index = 0;
        int lowest = 0;
        while(true){
            // Step 2. Rightmost char smallest than its neighbour
            for(int i = 0; i < temp.length - 1; i++){
                if(temp[i] < temp[i+1]){
                    lowest = i;
                }
            }
            // index of CHAR1
            index = lowest;
            // Step3. Find the ceiling of the
            int j = findCeiling(temp, index);
            // Breaking condition at this juncture
            // all permutations are printed
            if(j == index) break;

            swap(temp, index, j);
            String a = String.valueOf(temp);
            // Step4. Sort the substring
            char[] b = a.substring(index + 1).toCharArray();
            Arrays.sort(b);
            a = a.substring(0, index + 1) + String.valueOf(b);
            temp = a.toCharArray();
            System.out.println( "String " + String.valueOf(temp));
            //}
        }
    }

    /**
     *
     */
    public static int findCeiling(char[] temp, int index){
        int k = index;
        char test = temp[index];
        while (k < temp.length - 1){
            if(temp[index] < temp[k + 1]){
                index = k + 1;
                break;
            }
            k++;
        }
        k = index;
        while (k < temp.length - 1){
            if((temp[index] > temp[k + 1]) && (temp[k + 1] > test)){
                index = k + 1;
            }
            k++;
        }
        return index;
    }

    /**
     * Method used for swapping the char
     */
    private static void swap(char[] str, int i, int j){
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    public static void main(String[] args) {
        String str = "ABC";
//        permute(str, 0, str.length() - 1);
        permute(str);
    }
}
