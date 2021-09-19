package practiceAlgo;

import java.util.ArrayList;
import java.util.List;

public class hackRankArrayList {
    public static List<Integer> compare(List<Integer> a, List<Integer> b){
        List<Integer> result = new ArrayList<>();
        result.add(0, 0);
        result.add(1, 0);
        for(int i = 0; i < a.size(); i++){
            if(a.get(i) != b.get(i)){
                if(a.get(i) > b.get(i)){
                    result.set(0, (result.get(0) + 1));
                }
                if(a.get(i) < b.get(i)){
                    result.set(1, (result.get(1) + 1));
                }
            }
        }
        for(int i = 0; i < result.size(); i++){
            System.out.print(result.get(i)+" ");
        }
        return result;
    }
    public static void main(String[] args) {
//        int []a = {1, 2, 3};
//        int []b = {1, 3, 2};
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        b.add(1);
        b.add(3);
        b.add(2);
        System.out.println(a);
        System.out.println(b);
        compare(a, b);
//        for ((int i = 0; i < res.size()))
    }
}
