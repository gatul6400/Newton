package DSA3_practice.tree;

public class heapSort {
    public static void main(String[] args) {
        int arr[] = {9, 5, 8, 2, 7, 1, 6, 4};
        heap(arr, arr.length);
    }
    public static void heap(int arr[], int n){
        for(int i = n/2 - 1; i >= 0; i--){
            heapify(arr, n, i);
        }
        for(int i = n-1; i>=0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void heapify(int arr[], int n, int i){
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if(left < n && arr[left] > arr[largest]){
            largest = left;
        }
        if(right < n && arr[right] > arr[largest]){
            largest = right;
        }
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }
}
