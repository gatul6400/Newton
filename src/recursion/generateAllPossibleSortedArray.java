package recursion;

import java.util.ArrayList;
import java.util.List;

public class generateAllPossibleSortedArray {
    public static void main(String[] args) {
        int arrA[] = {10, 15, 25};
        int arrB[] = {1, 5, 20, 30};
        printPossibility(arrA, arrB, arrA.length, arrB.length);
//        generate(arrA, arrB, arrA.length, arrB.length);
    }
    static void printPossibility(int arrA[], int arrB[], int n1, int n2){
//        List<Integer> temp = new ArrayList<>();
        int temp [] = new int[n1 + n2];
//        String str = "A";
        int count = 0;
        getPossibility(arrA, arrB, n1, n2, 0, 0, temp, true, 0);
    }
    static void getPossibility(int arrA[], int arrB[], int n1, int n2, int i, int j, int temp[], boolean flag, int len){
        if(flag){
            if(len != 0){
                printArr(temp, len + 1);
            }
            for(int k = i; k < n1; k++){
                if(len == 0){
                    temp[len] = arrA[k];
                    getPossibility(arrA, arrB, n1, n2, k + 1, j, temp, !flag, len);
                }
                else if(arrA[k] > temp[len]){
                    temp[len + 1] = arrA[k];
                    getPossibility(arrA, arrB, n1, n2, k + 1, j, temp, !flag, len + 1);
                }
            }
        }
        else{
            for(int l = j; l < n2; l++){
                if(arrB[l] > temp[len]){
                    temp[len + 1] = arrB[l];
                    getPossibility(arrA, arrB, n1, n2, i, l + 1, temp, !flag, len + 1);
                }
            }
        }
    }

    static void generateUtil(int A[], int B[], int C[], int i, int j, int m, int n, int len, boolean flag) {
        if (flag) // Include valid element from A
        {
            // Print output if there is at least one 'B' in output array 'C'
            if (len != 0)
                printArr(C, len + 1);

            // Recur for all elements of A after current index
            for (int k = i; k < m; k++)
            {
                if (len == 0)
                {
                    /* this block works for the very first call to include
                    the first element in the output array */
                    C[len] = A[k];

                    // don't increment lem as B is included yet
                    generateUtil(A, B, C, k + 1, j, m, n, len, !flag);
                }

                /* include valid element from A and recur */
                else if (A[k] > C[len])
                {
                    C[len + 1] = A[k];
                    generateUtil(A, B, C, k + 1, j, m, n, len + 1, !flag);
                }
            }
        }

        /* Include valid element from B and recur */
        else
        {
            for (int l = j; l < n; l++)
            {
                if (B[l] > C[len])
                {
                    C[len + 1] = B[l];
                    generateUtil(A, B, C, i, l + 1, m, n, len + 1, !flag);
                }
            }
        }
    }

    /* Wrapper function */
    static void generate(int A[], int B[], int m, int n)
    {
        int C[] = new int[m + n];

        /* output array */
        generateUtil(A, B, C, 0, 0, m, n, 0, true);
    }

    // A utility function to print an array
    static void printArr(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
}
