package practiceAlgo;

public class assignment {
    public static void main(String[] args) {
        int x = 6;
        System.out.println(getMarks(x));
    }
    public static int getMarks(int x){
        int res = 0;
        if(x > 5){
            res = x;
        }else{
            res = x + 1;
        }
        return res;
    }
}
