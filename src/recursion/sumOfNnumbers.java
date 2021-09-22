package recursion;

public class sumOfNnumbers {
    public static void main(String[] args) {
        System.out.println(getNumSum(9));
        System.out.println(getNumSumIntitial(5, 9));
    }
    public static int getNumSum(int n){
        if(n == 1){
            return 1;
        }
        return n + getNumSum(n - 1);
    }
    public static int getNumSumIntitial(int n, int m){
        if(n == m){
            return n;
        }
        return n + getNumSumIntitial(n + 1, m);
    }
}
