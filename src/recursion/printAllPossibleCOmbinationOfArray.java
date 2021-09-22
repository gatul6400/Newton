package recursion;

import java.util.ArrayList;
import java.util.List;

public class printAllPossibleCOmbinationOfArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
//        System.out.println(printCombination(arr, 0, 0, 2, arr.length));
//        printCombination2(arr, 0, 0, 3, arr.length);
        printCombinations(arr, arr.length, 3);
        System.out.println(result2);
    }
    static List<List<Integer>> result = new ArrayList<>();
    static List<int []> result2 = new ArrayList<>();
    public static List printCombination(int arr[], int i, int j, int k, int n){
        if(i >= n - 1){
            return result;
        }
        if(j >= n - 1){
            i++;
            j = i;
        }
        List<Integer> res = new ArrayList<>();
        res.add(arr[i]);
        for(int l = j + 1; l < k + j; l++){
            if(k + j <= n){
                res.add(arr[l]);
            }
        }
        if(res.size() >= k){
            result.add(res);
        }
        return printCombination(arr, i, j + 1, k, n);
    }

    public static int printCombination2(int arr[], int i, int j, int k, int n){
        if(i >= n - 1){
            return 0;
        }
        if(j >= n - 1){
            i++;
            j = i;
        }
        List<Integer> res = new ArrayList<>();
        res.add(arr[i]);
        for(int l = j + 1; l < k + j && k + j <= n; l++){
                res.add(arr[l]);
        }
        if(res.size() >= k){
            System.out.print(res + " ");
//        result.add(res);
        }
        return printCombination2(arr, i, j + 1, k, n);
    }

    public static void printCombinations(int arr[], int n, int k){

        int temp[] = new int[k];
//        combinationUtil(arr, n, k, 0, temp, 0);
        combination(arr, temp, 0, 0, k, n);
    }

    public static void combination(int arr[], int[] temp, int i, int j, int k, int n){
        if(i == k){
            result2.add(temp);
            for(int l = 0; l < k; l++){
                System.out.print(temp[l]+" ");
            }
            System.out.println();
            return;
        }

        if(j >= n){
            return;
        }

        temp[i] = arr[j];
        combination(arr, temp, i + 1, j + 1, k, n);
        combination(arr, temp, i, j + 1, k, n);
    }
    static void combinationUtil(int arr[], int n, int r, int index,
                                int data[], int i)
    {
        // Current combination is ready to be printed, print it
        if (index == r)
        {
            for (int j=0; j<r; j++)
                System.out.print(data[j]+" ");
            System.out.println("");
            return;
        }

        // When no more elements are there to put in data[]
        if (i >= n)
            return;

        // current is included, put next at next location
        data[index] = arr[i];
        combinationUtil(arr, n, r, index+1, data, i+1);

        // current is excluded, replace it with next (Note that
        // i+1 is passed, but index is not changed)
        combinationUtil(arr, n, r, index, data, i+1);
    }
}
