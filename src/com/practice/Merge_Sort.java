package com.practice;
public class Merge_Sort {
    static class MergeSort
    {
        // Merges two subarrays of arr[].
        // First subarray is arr[l..m]
        // Second subarray is arr[m+1..r]
        static void merge(int arr[], int l, int m, int r)
        {
            // Find sizes of two subarrays to be merged
            int n1 = m - l + 1;
            int n2 = r - m;

            /* Create temp arrays */
            int L[] = new int[n1];
            int R[] = new int[n2];

            /*Copy data to temp arrays*/
            for (int i = 0; i < n1; i++)
                L[i] = arr[l + i];
            for (int i = 0; i < n2; i++)
                R[i] = arr[m + 1 + i];

            /* Merge the temp arrays */

            // Initial indexes of first and second subarrays
            int i = 0, j = 0;

            // Initial index of merged subarry array
            int k = l;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                }
                else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }

            /* Copy remaining elements of L[] if any */
            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }

            /* Copy remaining elements of R[] if any */
            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }

        // Main function that sorts arr[l..r] using
        // merge()
        static int[] sortMerge(int arr[], int l, int r)
        {
            if (l < r) {
                // Find the middle point
                int m =l+ (r-l)/2;

                // Sort first and second halves
                sortMerge(arr, l, m);
                sortMerge(arr, m + 1, r);

                // Merge the sorted halves
                merge(arr, l, m, r);
            }
            return arr;
        }

        /* A utility function to print array of size n */
        static void printArray(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

        // Driver code
        public static void main(String args[])
        {
            int arr[] = {6, 5, 4,8,70, 3, 2 };

            System.out.println("Given Array");
            printArray(arr);


            sortMerge(arr, 0, arr.length - 1);
            System.out.println("\nMergeSorted array");
            printArray(arr);


            quickSort(arr, 0, arr.length - 1);
            System.out.println("\nQuickSorted array");
            printArray(arr);

        }
        static void quickSort(int arr[], int start, int end){
            if(start < end){
                int pivotPosition = partition(arr, start, end);
                quickSort(arr, start, pivotPosition - 1);
                quickSort(arr, pivotPosition + 1 , end);
            }
        }
        static int partition(int arr[], int start, int end){
            int pivot = arr[end];
            int pivotPosition = start - 1;
            for(int i = start; i < end; i++){
                if(arr[i] < pivot){
                    pivotPosition++;
                    int temp = arr[pivotPosition];
                    arr[pivotPosition] = arr[i];
                    arr[i] = temp;
                }
            }
            int temp = arr[pivotPosition + 1];
            arr[pivotPosition + 1] = arr[end];
            arr[end] = temp;
            return pivotPosition + 1;
        }
    }
}
