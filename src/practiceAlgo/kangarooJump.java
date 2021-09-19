package practiceAlgo;

public class kangarooJump {
    public static void main(String[] args) {
        int x1 = 43;
        int v1 = 5;
        int x2 = 49;
        int v2 = 3;
        checkMeet(x1, v1, x2, v2);
    }
    public static void checkMeet(int x1, int v1, int x2, int v2){
        int max = 1;
        int min = 0;
        if((x1 + v1) == (x2 + v2)){
            System.out.println("Yes");
            return;
        }
        else if(x2 > x1 && v2 > v1){
            System.out.println("No");
            return;
        }
        else if(x1 > x2 && v1 > v2){
            System.out.println("No");
            return;
        }
        else{
            int temp = (max * v1) + x1;
            int temp2 = (max * v2) + x2;
            if(v1 > v2){
                if((v1 / v2) < 2){
                    while(temp != temp2){
                        min = max;
                        max = max * 2;
                        temp = (v1 * max) + x1;
                        temp2 = (v2 * max) + x2;

                        System.out.println(temp+"  "+temp2);
                        if(temp > temp2){
                            for(int i = min; i <= max; i++){
                                if(temp == temp2){
                                    System.out.println("Yes");
                                    return;
                                }
                                temp = (v1 * i) + x1;
                                temp2 = (v2 * i) + x2;
                            }
                            System.out.println("No");
                            return;
                        }
                    }
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
            else{
                if((v2 / v2) < 2){
                    while (temp2 != temp){
                        max = max * 2;
                        temp = (v1 * max) + x1;
                        temp2 = (v2 * max) + x2;
                        System.out.println(temp+"  "+temp2);
                        if(temp2 > temp){
                            for(int i = min; i < max; i++){
                                if(temp == temp2){
                                    System.out.println("Yes");
                                    return;
                                }
                                temp = (v1 * i) + x1;
                                temp2 = (v2 * i) + x2;
                            }
                            System.out.println("No");
                            return;
                        }
                    }
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
        }
    }
}
