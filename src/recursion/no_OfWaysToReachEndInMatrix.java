package recursion;

public class no_OfWaysToReachEndInMatrix {
    /*Rule ->
            1 - Moves only right and bottom.
     */
    public static void main(String[] args) {
        int arr[][] = new int[3][4];
        System.out.println(getCount(arr, 4, 4));
    }
    public static int getCount(int arr[][], int n, int m){
        if(n == 1 || m == 1){
            return 1;
        }
        return getCount(arr, n - 1, m) + getCount(arr, n, m - 1);
    }
}
