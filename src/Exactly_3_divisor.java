//public class Exactly_3_divisor {
//    Also guys I have reported 3 divisor problem TLE issue with NS, seems like a bug with the software or the input cases
//
//    This is final solution which is fine

//import java.io.*;
import java.util.*;
import java.lang.*;

    class Mainn{
        public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);

            int T=sc.nextInt();
            while(T-->0)
            {

                int N;
                N=sc.nextInt();

                System.out.println(exactly3Divisors(N));


            }

        }

        public static boolean isPrime(int n)
        {
            if(n<=1)
                return false;

            for(int i=2;i<=Math.sqrt(n);i++)
                if(n%i==0)
                    return false;

            return true ;
        }

        // function to check if n is perfect square
        public static boolean isPerfectSquare(int n)
        {
            int root=(int)Math.sqrt(n);
            return root*root==n;
        }

        // function to check the numbers which has exactly 3 divisors
        public static int exactly3Divisors(int N)
        {
            int counter=0; //Initializing counter to zero

            for(int i=1;i<=N;i++) //Running a loop from 1 to N
            {
                if(isPerfectSquare(i)&&isPrime((int)Math.sqrt(i))) //A number N only has 3 divisors if it is a perfect square and its square root is a prime number
                    counter++;
            }
            return counter;
        }
    }
//}
