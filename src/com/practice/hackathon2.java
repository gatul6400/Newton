package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class hackathon2 {
    static boolean isPrime(int n)
    {
        if(n<=1)
            return false;

        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0)
                return false;

        return true ;
    }

    static void sumOfPrimeNumbers(int l, int r){
        ArrayList <Integer> primes = new ArrayList<>();
        for(int i = 0; i < r * r; i++){
            if(isPrime(i)){
                primes.add(i);
            }
        }
        long sum = 0;
        for(int i = l-1; i < r; i++){
            sum += primes.get(i);
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        sumOfPrimeNumbers(1, 5);
        int testCases = sc.nextInt();
        while(testCases-- > 0){
            int L = sc.nextInt();
            int R = sc.nextInt();
            sumOfPrimeNumbers(L, R);
        }

    }
}
