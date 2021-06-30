package com.practice;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class power {
    public static double power(double x, int n){
        if (n == Integer.MIN_VALUE){
            n = - (Integer.MAX_VALUE - 1);
        }
        if (n == 0){
            return 1.0;
        }
        else if (n < 0){
            return 1 / power(x, -n);
        }
        else if (n % 2 == 1){
            return x * power(x, n - 1);
//            System.out.println(x * power(x, n - 1));
        }
        else {
            double sqrt = power(x, n / 2);
//            System.out.println(power(x, n / 1));
            System.out.println("Square Root"+sqrt);
            return sqrt * sqrt;
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while (testCase-- > 0){
            double X = sc.nextDouble();
            int N = sc.nextInt();
            System.out.format("%.2f",power(X, N));
            System.out.println();
        }
    }
}
