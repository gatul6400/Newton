package recursion;

public class printAllSequenceOfLengthK {
    public static void main(String[] args) {
        printSeq(5, 3);
    }
    static void printSeq(int n, int k){
        int arr[] = new int[n];
        for(int i = 1; i <= n; i++){
            arr[i - 1] = i;
        }
        int temp[] = new int[k];
        getSequence(arr, n, k, 0, 0, temp);
    }
    static void getSequence(int arr[], int n, int k, int i, int j, int temp[]){
        if(i == k){
            for(int l = 0; l < k; l++){
                System.out.print(temp[l]+" ");
            }
            System.out.println();
            return;
        }
        if (j >= n){
            return;
        }
        temp[i] = arr[j];
        getSequence(arr, n, k, i + 1, j + 1, temp);
        getSequence(arr, n, k, i, j + 1, temp);
    }
}
