package recursion;

public class nonRepeatedElementInArray {
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 4, 5, 1};
        int res = 0;
        for(int i = 0; i < arr.length; i++){
            res = res ^ arr[i];
        }
        System.out.println(res);
    }
}
