package recursion;

public class gp {
    public static void main(String[] args) {
        printGP(3, 2, 5);
    }
    static void printGP(int a, int r, int n)
    {
        int curr_term;
        for (int i = 0; i < n; i++) {
            curr_term = a * (int)Math.pow(r, i);
            System.out.print(curr_term + " ");
        }
    }

}
