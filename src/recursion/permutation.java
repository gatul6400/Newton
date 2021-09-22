package recursion;

import java.util.Arrays;
import java.util.Collections;

public class permutation {
    public static void main(String[] args) {
        String str = "abc";
        permute(str, 0, str.length() - 1);
    }
    public static void permute(String str, int l, int r){
        if(l == r){
            System.out.print(str+" ");
            return;
        }
        for(int i = l; i <= r; i++){
            str = swap(str, l, i);
            permute(str, l + 1, r);
            str = swap(str, l, i);
        }
    }
    public static String swap(String str, int i, int j){
        char arr[] = str.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }
}
