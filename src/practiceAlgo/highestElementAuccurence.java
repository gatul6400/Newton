package practiceAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class highestElementAuccurence {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(18);
        list.add(90);
        list.add(90);
        list.add(13);
        list.add(90);
        list.add(75);
        list.add(90);
        list.add(8);
        list.add(90);
        list.add(43);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(list.size() - 1));
        int max = list.get(list.size() - 1);
        int count = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == max){
                count++;
            }
        }
        System.out.println(count);
    }
}
