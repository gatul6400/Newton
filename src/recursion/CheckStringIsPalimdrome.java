package recursion;

public class CheckStringIsPalimdrome {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(isPalimdrome(s, 0, s.length() - 1));
    }
    public static boolean isPalimdrome(String str, int l, int r){
        if(l >= r){
            return true;
        }
        if(str.charAt(l) != str.charAt(r)){
            return false;
        }
        return isPalimdrome(str, l + 1, r - 1);
    }
}
