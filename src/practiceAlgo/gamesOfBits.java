package practiceAlgo;

import java.util.Scanner;

public class gamesOfBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int result = 0;
        for(int i = 1; i <= n; i++){
            int a = i;
            long count = 0;
            while(a != 0){
                a = a & (a - 1);
                count++;
            }
            if(count == c){
                result++;
            }
        }
        System.out.println(result);
    }
}
