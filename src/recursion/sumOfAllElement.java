package recursion;

public class sumOfAllElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;
        System.out.println(getFactorial(5));
        System.out.println();
        System.out.println(getSumBackward(arr, arr.length - 1, 0));
        System.out.println();
        System.out.println(getSum(arr, 0, 0));
    }
    public static int getSumBackward(int arr[], int n, int sum){
        if(n >= 0){
            sum += arr[n];
            return getSumBackward(arr, n - 1, sum);
        }
        return sum;
    }

    public static  int getSum(int arr[], int n, int sum){
        if(n < arr.length){
            sum += arr[n];
            return getSum(arr, n + 1, sum);
        }
        return sum;
    }
    public static int getFactorial(int n){
        if(n == 1 || n == 0){
            return n;
        }
        return n * getFactorial(n - 1);
    }
}
