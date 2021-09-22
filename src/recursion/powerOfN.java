package recursion;

public class powerOfN {
    public static void main(String[] args) {
        System.out.println(getPowerOfN(3, 4));
    }
    public static long getPowerOfN(long n, long p){
        if(p == 0){
            return 1;
        }
        return n * getPowerOfN(n, p - 1);
    }
}
