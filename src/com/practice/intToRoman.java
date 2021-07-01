package com.practice;

public class intToRoman {
    public static int number(int i){
        if(i>=4){
            return 1000;
        }
        else if (i>=3){
            return 100;
        }
        else if (i>=2){
            return 10;
        }
        else{
            return 1;
        }
    }
    public static String numToRoman(int n){
        switch(n){
            case 1000:
                return "M";
            case 900:
                return "CM";
            case 500:
                return "D";
            case 400:
                return "CD";
            case 100:
                return "C";
            case 90:
                return "XC";
            case 50:
                return "L";
            case 40:
                return "XL";
            case 10:
                return "X";
            case 9:
                return "IX";
            case 5:
                return "V";
            case 4:
                return "IV";
            case 1:
                return "I";
            default:
                return "No Output";
        }
    }
    public static void intToRom(int num) {
        String result = "";
        String len = Integer.toString(num);

        // String str1 = Integer.toString(a);
        for(int i = len.length(); i >= 1; i--){
            String temResult = "";
            int count = 0;
            int Num = number(i);
            while(num % Num >= 0){
                // if (num % number(i) > 0){
                if (num / Num >0){
                    num -= Num;
                    count++;
                    temResult +=  numToRoman(Num);
//                    if (num <= 1){
//                        return;
//                    }
                    if (count == 4 && Num != 1000){
                        temResult = numToRoman(Num * 4);
                    }
                    else if (count == 5 && Num != 1000){
                        temResult = numToRoman(Num * 5);
                    }
                    else if (count == 9 && Num != 1000){
                        temResult = numToRoman(Num * 9);
                    }

                }
                else{
                    break;
                }
                // }
            }
            result += temResult;
            if (num <= 0){
                break;
            }
        }
        System.out.println(result);
//        return result;
    }
}
