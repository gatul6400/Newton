package recursion;

public class factorial {
    public static void main(String[] args) {
        System.out.println(getFact(5));
        System.out.println(getFactIntitial(4, 5));
    }
    public static int getFact(int n){
        if(n == 1 || n == 0){
            return n;
        }
        return n * getFact(n - 1);
    }

    public static int getFactIntitial(int n, int m){
        if(n == 0){
            return getFactIntitial(n + 1, m);
        }
        if(n == m){
            return n;
        }
        return n * getFactIntitial(n + 1, m);
    }
}
