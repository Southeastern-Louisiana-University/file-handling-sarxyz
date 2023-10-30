package chapter18;

public class Fibonacci {
    public static void main (String[] args){
        long result = fib(12);
        System.out.println("fib(12) = " + result);
    }
    public static long fib(int n){
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fib(n -1) + fib(n-2);
    }
}

