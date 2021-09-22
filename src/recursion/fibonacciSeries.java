package recursion;

public class fibonacciSeries {
    public static void main(String[] args) {
//        System.out.println(getFibo(6));
        System.out.println(getfiboSeries(0, 6));
    }
    public static int getFibo(int n){
        if (n == 0 || n == 1){
            return n;
        }
        System.out.print(n+" ");
        return getFibo(n-1) + getFibo(n -2);
    }

    public static int getfiboSeries(int n, int m){
        if(n == 1 || n == 0){
            return getfiboSeries(n + 1, m);
        }
        if(n == m){
            return n +1;
        }
        return getfiboSeries(n + 1, m);
    }
}
