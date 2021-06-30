package com.practice;

public class romanToInt {
    public static int romanToInteger(char a) {
        switch (a) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void RomanToInt(String s) {
        int sum = romanToInteger(s.charAt(0));
        for (int i = 1; i < (s.length() + 2); i++) {
            int current = romanToInteger(s.charAt(i));
//            int next = romanToInteger(s.charAt(i + 1));
            int previous = romanToInteger(s.charAt(i - 1));
            System.out.println(i+":-"+previous+"     "+current+"     "+previous);
            // sum += current;
            if (current < previous) {
                System.out.println("if");
                sum -= 2 * current;
                System.out.println(sum);
            } else {
                System.out.println("else");
                sum += current;
                System.out.println(sum);
            }
        }
        System.out.println(sum);
    }
}
//    public static void main(String[] args){
//
//        }
//}
