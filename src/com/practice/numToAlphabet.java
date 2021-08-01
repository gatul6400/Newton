package com.practice;

public class numToAlphabet {
    public static int number(int n){
        if (n >= 10){
            return 1000000000;
        }
        else if(n >= 7){
            return 1000000;
        }
        else if (n >= 4){
            return 1000;
        }
        else if (n >= 3) {
            return 100;
        }
        else if (n >= 2){
            return 10;
        }
        else if (n >= 1){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static String Alphabet(int i){
        switch (i){
            case 0:
                return " ";
            case 1:
                return "One ";
            case 2:
                return "Two ";
            case 3:
                return "Three ";
            case 4:
                return "Four ";
            case 5:
                return "Five ";
            case 6:
                return "Six ";
            case 7:
                return "Seven ";
            case 8:
                return "Eight ";
            case 9:
                return "Nine ";
            case 10:
                return "Ten ";
            case 11:
                return "Eleven ";
            case 12:
                return "Twelve ";
            case 13:
                return "Thirteen ";
            case 14:
                return "Fourteen ";
            case 15:
                return "Fifteen ";
            case 16:
                return "Sixteen ";
            case 17:
                return "Seventeen ";
            case 18:
                return "Eighteen ";
            case 19:
                return "Nineteen ";
            case 20:
                return "Twenty ";
            case 30:
                return "Thirty ";
            case 40:
                return "Forty ";
            case 50:
                return "Fifty ";
            case 60:
                return "Sixty ";
            case 70:
                return "Seventy ";
            case 80:
                return "Eighty ";
            case 90:
                return "Ninety ";
            case 100:
                return "Hundred ";
            case 1000:
                return "Thousand ";
            case 1000000:
                return "Million ";
            case 1000000000:
                return "Billion ";
            default:
                return "No Output";
        }
    }
    public static String intToAlbhabet(int num){
        String result = "";
        String len = Integer.toString(num);
        for(int i = len.length(); i >= 1; i--){
            String temResult = "";
            int Num = number(i);
            int breakPoint = 0;
            if (num == 0){
                return "Zero";
            }
            while(num%Num >=0){
                if(num/Num > 0){
                    int temNum = num/Num;
                    num = num%Num;
                    if (Num >= 1000000000){
                        temResult = Alphabet(temNum) + Alphabet(Num);
                    }
                    else if (Num >= 1000000){
                        temResult = intToAlbhabet(temNum)+" " + Alphabet(Num);
                    }
                    else if (Num >= 1000){
                        temResult = intToAlbhabet(temNum)+" " + Alphabet(Num);
                    }
                    else if (Num >= 100){
                        temResult = Alphabet(temNum) + Alphabet(Num);
                    }
                    else if (temNum > 1 && Num >= 10){
                        temResult =  Alphabet(Num * temNum);
                    }
                    else if (Num >= 10){
                        temResult = Alphabet(Num + num);
                        breakPoint++;
                    }
                    else if (num >= 0 && Num >= 1){
                        temResult = Alphabet(Num * temNum);
                    }
                }
                else{
                    break;
                }
            }
            result += temResult;
            if (num <=0 || breakPoint > 0){
                break;
            }
        }
        return result.trim();
    }
}
