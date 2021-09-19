package practiceAlgo;

import java.util.Scanner;

public class stringAlphabhet {
    public static char getAlphabet(int n){
        switch (n){
            case 1:{
                return 'a';
            }
            case 2:{
                return 'b';
            }
            case 3:{
                return 'c';
            }
            case 4:{
                return 'd';
            }
            case 5:{
                return 'e';
            }case 6:{
                return 'f';
            }
            case 7:{
                return 'g';
            }
            case 8:{
                return 'h';
            }
            case 9:{
                return 'i';
            }
            case 10:{
                return 'j';
            }
            case 11:{
                return 'k';
            }
            case 12:{
                return 'l';
            }
            case 13:{
                return 'm';
            }
            case 14:{
                return 'n';
            }
            case 15:{
                return 'o';
            }
            case 16:{
                return 'p';
            }
            case 17:{
                return 'q';
            }
            case 18:{
                return 'r';
            }
            case 19:{
                return 's';
            }
            case 20:{
                return 't';
            }
            case 21:{
                return 'u';
            }
            case 22:{
                return 'v';
            }
            case 23:{
                return 'w';
            }
            case 24:{
                return 'x';
            }
            case 25:{
                return 'y';
            }
            case 26:{
                return 'z';
            }
            default:{
                return ' ';
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = "";
        result = getString(n);
        System.out.println(result.trim());
    }
    public static String getString(int n){
        int count = 0;
        String temp = "";
        while (n > 26){
            n -= 26;
            count++;
        }
        if(count > 26){
            temp += getString(count);
        }else{
            temp += getAlphabet(count);
        }
        temp += getAlphabet(n);
        return temp;
    }
}
