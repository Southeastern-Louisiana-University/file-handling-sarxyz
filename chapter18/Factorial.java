package chapter18;

public class Factorial {
    public static void main(String[] args){
        long result = fact(5);
        System.out.println(("Result of our fact(5) is " + result));
    }
    public static long fact(int n ){
        // base case
        if ((n == 0) || (n == 1))
            return 1;
        else
            return n * fact(n - 1);
    }
}
