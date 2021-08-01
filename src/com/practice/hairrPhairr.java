package com.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class hairrPhairr {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "hhoowaaaareyyoouu";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        int count = 1;
        for(int i = 0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }else{
            map.put(str.charAt(i), count);

            }
        }
        for(Map.Entry<Character, Integer> e : map.entrySet()){
            if(e.getValue() == 1){
                System.out.print(e.getKey());
            }
        }
        System.out.println("\n"+map);
    }
}
