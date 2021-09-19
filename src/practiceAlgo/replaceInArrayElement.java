package practiceAlgo;

public class replaceInArrayElement {
    public static void main(String[] args) {
        int n = 12345;
        String res = "";
        while(n != 0){
            int digit = n % 10;
            res += digit * digit;
            n /= 10;
        }
//        If return integer
//        int result = Integer.parseInt(res);


        System.out.println(res);
    }
}
