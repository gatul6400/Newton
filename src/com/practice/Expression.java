package com.practice;

import java.util.Scanner;

public class Expression {
    public static double power(double x, double n){
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
        }
        else {
            double sqrt = power(x, n / 2);
            return sqrt * sqrt;
        }
    }
    public static  void evaluate(double n){
        double res = 0;
        for (int i = 1; i < 5; i++){
            double s = power(n, i);
            res += s;
        }
        System.out.println(res%5);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-->0){
            double n = sc.nextDouble();
            evaluate(n);
        }
    }
}
