package com.practice;

public class hackathon {
    static long mod = 1000000007;
    static void f(int n, int k){
//        System.out.println((500000005+500000005)%1000000007);
//        System.out.println((3+3)%1000000007);
            int temp = k;
            long result = 0;
        for(int i = n; i > 1; i--){
            if (temp%2 == 0){
                temp /= 2;
                if(temp >= 0){
                    if(((temp + temp) % mod) == k){
                        result = temp;
                    }
                }
            }
            else{
                result = (mod + temp) / 2;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int n = 2;
        int k = 6;
        f(n, k);
    }
}
