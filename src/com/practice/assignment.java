package com.practice;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class assignment {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        char A = 'A';
//        int count = 0, exCount = 0;
//        // ABAAABBBAA
//        for(int i = 0; i<s.length(); i++){
//            char n = s.charAt(i);
//            System.out.print(n);
//            if (A == (n)){
//                count++;
//            }
//            else{
//                if(count > exCount){
//                    System.out.println(n);
//                    exCount = count;
//                    count = 0;
//                }
//                else{
//                    count = 0;
//                }
//            }
//        }
//        if(count > exCount){
//            System.out.println(count);
//        }
//        else {
//            System.out.println(exCount);
//        }
//    }
//
//    public static ArrayList<Integer> sieve(int n){
//        boolean[] isPrime = new boolean[n+1];
//        Arrays.fill(isPrime, true);
//        isPrime[0] = false;
//        isPrime[1] = false;
//        for(int i=2; i<=n; i++){
//            if(isPrime[i]){
//                for(int j = i*i; j<=n; j+=i){
//                    isPrime[j] = false;
//                }
//            }
//        }
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        for(int i=2; i<=n; i++){
//            if(isPrime[i]) {
//                list.add(i);
//            }
//        }
//        return list;
//    }
//    public static int segmentedSieve(int n){
//        int count = 0;
//        if(n>=2){
//            int limit = (int)Math.sqrt(n);
//            ArrayList<Integer> primes = sieve(limit);
//            count = primes.size();
//            int low = limit;
//            int high = 2*limit;
//            while(low < n){
//                if(high >= n)
//                    high = n;
//                boolean [] mark = new boolean[limit + 1];
//                Arrays.fill(mark, true);
//                for(int i=0; i<primes.size(); i++){
//                    int smallest = low/primes.get(i) * primes.get(i);
//                    if(smallest < low)
//                        smallest = smallest + primes.get(i);
//                    for(int j= smallest; j <= high; j = j + primes.get(i)){
//                        mark[j-low] = false;
//                    }
//                }
//                for(int i = low; i<=high; i++){
//                    if(mark[i-low]){
//                        count++;
//                    }
//                }
//                low = low + limit;
//                high = high + limit;
//            }
//        }
//        return count;


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        long sum = 0;
//        for(int i = 1; i < n; i++){
//            int temp = a + b + c;
//            sum += a;
//            a = b;
//            b = c;
//            c = temp;
//        }
//        System.out.println(sum);


//        int n = sc.nextInt();
//        int k = sc.nextInt();
//
//        System.out.println(safe_Position(n, k));
//
//    }
//        public static int safe_Position(int n, int k){
//            if(n == 0){
//                return 0;
//            }
//            return size(n, k);
//            if (n == 1)
//                return 1;
//            else
//                System.out.println((n-1+"   "+k) + (k - 1)%(n + 1));
//                return (safe_Position(n - 1, k) + k-1) % n + 1;
//        }
//
//        public static int size(int n, int k){
//            boolean arr[] = new boolean[n];
//            Arrays.fill(arr, true);
//            int N = n;
//            int temp = k;
//            int count = k;
//            while(N-->0){
//                for(int j = 1; j <= n; j++){
//                    if(arr[j - 1]){
//                        count--;
//                        if(count == 0){
//                            arr[j - 1] = false;
//                            count = temp;
////                            k += temp;
//                        }
//                    }
////                    k = k - n;
//                }
//
//            }
//            for(int i = 0; i < n; i++){
//                if(arr[i]){
//                    return i+1;
//                }
//            }
//            return 0;
//        }




//        Scanner sc = new Scanner(System.in);
        long n1 = sc.nextLong();
        long n2 = sc.nextLong();
        while (n1 > 0 && n2 > 0){
            // if (n2 % 2 != 0){
            // 	System.out.println("Aniket   "+n1);
            // 	return;
            // }
            // else if (n1 % 2 != 0){
            // 	System.out.println("Swapnil   "+n2);
            // 	return;
            // }
            n1 /= 2;
            if (n1 == 0){
                break;
            }
            n2 /= 2;
        }
        if (n1 > n2){
            System.out.println(n1+"   Aniket   "+n1);
        }
        else{
            System.out.println(n1+ "  Swapnil  "+n2);
        }
    }
}
