package interview;

public class DSA3Interview2 {
    public static void main(String[] args) {
        int arr[] = {3, 5, 9, 6, 8, 20, 10, 12, 18, 9};
        heap(arr, arr.length);
    }
    static void heap(int arr[], int n){
        for(int i = n/2 - 1; i>=0; i--){
            heapify(arr, n, i);
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void heapify(int arr[], int n, int i){
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
