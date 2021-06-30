package com.practice;

import java.util.Scanner;

public class arrayy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Size : ");
        int size = sc.nextInt();
//        int a [] = new int[size];
//        boolean temp = false;
//        for (int i = 0; i<size; i++){
//            System.out.println("Enter in array : ");
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i < size; i++) {
//            System.out.println("Array check : ");
//            if (a[i] < 0) {
//                temp = true;
//                break;
//            }
//        }
//        if (temp){
//            System.out.println("Yes");
//        }
//        else {
//            System.out.print("No");
//        }




//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Size : ");
//        int T = sc.nextInt();
//        int max = 0;
//        int min = 0;
//        for(int i = 0; i<T; i++){
//            System.out.print("Enter Array Size : ");
//            int size = sc.nextInt();
//            int a[] = new int[size];
//            for(int j = 0; j<size; j++){
//                System.out.print("Enter in Array : ");
//                a[j] = sc.nextInt();
//            }
//            min = a[0];
//            max = a[0];
//            for(int check = 0; check<size; check++){
//                if (a[check]>max){
//                    max = a[check];
//                }
//                if (a[check]<min){
//                    min = a[check];
//                }
//            }
//            System.out.print(max+" "+min);
//        }






//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter T :");
//        int T = sc.nextInt();
//        for(int t=0; t<T; t++){
//            System.out.println("size :");
//            int size = sc.nextInt();
//            int a[] = new int[size];
//            for(int j = 0; j<size; j++){
//                System.out.println("Enter");
//                a[j]=sc.nextInt();
//            }
//            int first = 0;
//            int second =0;
//            int third=0;
//            for(int i = 0; i<size; i++){
//                if (a[i]>first){
////                    System.out.println("first");
//                    third = second;
//                    second = first;
//                    first = a[i];
//                }
//                else if (a[i]>second){
////                    System.out.println("second");
//                    third = second;
//                    second = a[i];
//                }
//                else if (a[i]>third){
////                    System.out.println("third");
//                    third = a[i];
//                }
//            }
//            System.out.println(first+" "+second+" "+third);
//        }






//        Scanner sc = new Scanner(System.in);
//        System.out.println("size :");
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//        int arr1[] = new int[size];
//        for(int i = 0; i<size; i++){
//            arr[i] = sc.nextInt();
//        }
//        int count = size -1;
//        for(int i = 0; i<size; i++){
//            if (2>i){
//                arr1[i] = arr[0]*arr[i+1];
//                System.out.println(arr1[i]);
//            }
//            arr1[i]=arr[1]*arr[i+1];
//            System.out.println(arr1[i]);
//            if (count <= i){
//                arr1[i] = arr[size]*arr[i];
//                System.out.println(arr1[i]);
//                System.out.println(count);
//            }
//        }
//        for(int i = 0; i<size; i++){
//            System.out.print(arr1[i]+" ");
//        }



//            Scanner sc = new Scanner(System.in);
//            int n=sc.nextInt();
//            int a[] = new int[n];
//            for(int i=0;i<n;i++){
//                a[i]=sc.nextInt();
//            }
//            System.out.print(a[0]*a[1]+" ");
//            for(int i=1;i<n-1;i++){
//                System.out.print(a[i-1]*a[i+1]+" ");
//            }
//            System.out.print(a[n-1]*a[n-2]);



//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//        int sum = 0;
//        int product = 1;
//        for (int i = 0; i<size; i++){
//            arr[i]=sc.nextInt();
//        }
//        for (int i=0; i<size; i++){
//            if (i%2==0){
//                product *= arr[i];
////                System.out.println(arr[i]+"odd");
//            }
//            else{
//                sum +=arr[i];
////                System.out.println(arr[i]+"even");
//            }
//        }
//        System.out.print(sum+" "+product);






//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int a[] = new int[size];
//        boolean temp = true;
//        for (int i = 0; i<size; i++){
//            a[i] = sc.nextInt();
//        }
////        int max = a[size-1];
////        System.out.println(max);
//        for (int i = 0; i<size; i++){
//            while()
//            if (a[i]<=a[i+1]){
//            }
//            else{
//                temp = false;
//            }
//        }
//        if (temp){
//            System.out.println("Yes");
//        }
//        else {
//            System.out.println("No");
//        }




//
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int [] a= new int[size];
//        for (int i = 0; i<size; i++){
//            a[i] = sc.nextInt();
//        }
//        int possibleDiv=2;
//        for (int i = 1; i<size; i++){
//            while(possibleDiv <= a[i] && a[i] % possibleDiv != 0){
//                possibleDiv++;
//            }
//            if(possibleDiv>a[i]){
//                System.out.println("NO");
//                return;
//            }
//            possibleDiv++;
//        }
//        System.out.println("YES");






//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//        int count = 0;
//        for (int i = 0; i<size; i++){
//            arr[i] = sc.nextInt();
//        }
//        int val = arr[0];
//        for (int i = 0; i<size; i++){
//            if (arr[i]<=val){
//                val = arr[i];
//                count ++;
//                System.out.println(i+"hello"+arr[i]+"            "+val);
//            }
//            else{
//                break;
//            }
//        }
//        System.out.println(count);






//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int a[] = new int[size];
//        for (int i = 0; i<size; i++){
//            System.out.println("Input :");
//            a[i] = sc.nextInt();
//        }
//        int possibleDiv=2;
//        for (int i = 1; i<size; i++){
//            while(possibleDiv <= a[i] && a[i]%possibleDiv !=0){
//                possibleDiv++;
//                System.out.println(i+"  value  "+a[i]+"  While "+possibleDiv);
//            }
//            if(possibleDiv>a[i]){
//                System.out.println("NO");
//                return;
//            }
//            possibleDiv++;
//            System.out.println(i+"  value  "+a[i]+"  outside "+possibleDiv);
//        }
//        System.out.println("YES");









//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int n = sc.nextInt();
//        int [] arr = new int[a + n + 1];
//        int s=0, d=1, sum=0;
//        for(int i =0; i<arr.length; i++){
//            arr[i] = sum;
//            s = d;
//            d = sum;
//            sum = s + d;
//            if (a<=arr[i]){
//                int sum1 = arr[i];
//                int s1, d1=arr[i-1];
//                for (int j = 0; j<n; j++){
//                    System.out.print(sum1+"\t");
//                    s1 = d1;
//                    d1 = sum1;
//                    sum1 = d1 + s1;
//                }
//                return;
//            }
//        }






//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        String[] arr = new String[size];
//        for (int i = 0; i<size; i++) {
//            System.out.print("value of i : "+i+"\t");
//            arr[i] = sc.nextLine();
//            System.out.println();
//
//        }
//        for (int i = 0; i<size; i++){
//            System.out.println("Output : "+arr[i]);
//        }



//        String s = "LXII";
//
//        int sum = s.charAt(0);
//        int I = 1;
//        int V = 5;
//        int X = 10;
//        int L = 50;
//        int C = 100;
//        int D = 500;
//        int M = 1000;
//        int current = 0, next = 0;
//        for (int i = 0; i < s.length(); i++){
////            System.out.println((int)s.charAt(i));
//            current = (int)s.charAt(i);
//            next = (int)s.charAt(i + 1);
//            if(current == next){
//                System.out.println("Equal");
//                sum = sum + current;
//            }
//            else if(current < next){
//                System.out.println("Smaller");
//                sum = sum + (next - (2 * current));
//            }
//            else if(current > next){
//                System.out.println("Greater");
//                sum = sum + next;
//            }
//            System.out.println(i+"     "+s.charAt(i)+"    "+current+"     "+next+"     "+sum);
//        }
//        System.out.println(current);
//        System.out.println(sum);
//        throw new StringIndexOutOfBoundsException("No Output");


//        while (size-->0){
//            System.out.println(sumOfProductOfDigits(35, 356));
//        }






    }
//        public static int sumOfProductOfDigits(int n1, int n2)
//        {
//            if(n1==0 || n2 ==0){
//                System.out.println(n1+" Return   "+n2);
//                return 0;
//            }
//            System.out.println(n1+"    "+n2);
//            System.out.println();
//            System.out.println(n1%10+"     "+n2%10);
//            System.out.println();
//            System.out.println((n1%10)*(n2%10)+"MOd");
//            return (n1%10 * n2%10) + sumOfProductOfDigits(n1/10, n2/10);
//        }
}
