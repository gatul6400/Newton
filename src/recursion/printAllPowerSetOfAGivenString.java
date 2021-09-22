package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class printAllPowerSetOfAGivenString {
    public static void main(String[] args) {
        String str = "abc";
        powerSet(str, 0, "");
//        Collections.sort(result);
//        System.out.println(result);
    }
    static List<String> result = new ArrayList<>();
    public static void powerSet(String str, int i, String cur){
        if(i == str.length()){
//            result.add(cur);
            System.out.print(cur+" ");
            return;
        }
        powerSet(str, i + 1, cur+str.charAt(i));
        powerSet(str, i + 1, cur);
    }
}
