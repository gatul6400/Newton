package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class beautifulString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<String> temperary = new ArrayList<>();
        temperary.add("");
        for(int i = s.length() - 2; i >= 0; i-=2){
            String temp = "";
            for(int j = 0; j < 2; j++){
                temp = temp + s.charAt(i + j);
            }
            for(int j = 0; j < temperary.size(); j++){
                if(temperary.get(j).equals(temp)){
                    System.out.println("NO");
                    return;
                }
            }
            temperary.add(temp);
        }
        System.out.println("YES "+temperary.get(temperary.size() - 1));
    }
}
