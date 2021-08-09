package com.practice;

import java.util.*;
class Temp implements Comparable<Temp>{
    int val1;
    int val2;
    public Temp(int x, int y){
        this.val1 = x;
        this.val2 = y;
    }
    public int compareTo(Temp t)
    {
        if (val1 > t.val1) {
            return 1;
        }
        else if (val1 < t.val1) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
public class customClassWIthCompareTo_Comparator {
    public static void main(String args[]){
        PriorityQueue<Temp> pq = new PriorityQueue<>();
        // Temp x = new Temp();
        Temp x = new Temp(1, 0);
        Temp z = new Temp(11, 2);
        Temp y = new Temp(6, 3);
        pq.add(x);
        pq.add(z);
        pq.add(y);
        Temp a = pq.remove();
        System.out.println(a.val1 + " " + a.val2);
        Temp b = pq.remove();
        System.out.println(b.val1 + " " + b.val2);
    }
}
