package recursion;

public class josephusProblemKill_kth_person {
    /* Rules ->
        1 - Only kill kth person in N person's.
     */
    public static void main(String[] args) {
        System.out.println(getWinner(5, 3));
    }
    public static int getWinner(int n, int k){
        if(n == 1){
            return 0;
        }
        return (getWinner(n - 1, k) + k) % n;
    }
}
