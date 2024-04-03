package 알고리즘예시;

public class Fibonacci {
    // 재귀적 방법
    public int fibRecursive(int n )  {
        if(n <= 1) 
            return n;
        return fibRecursive(n -1) + fibRecursive(n -2);
    }

    public int fibDynamic(int n ) {
        int[]fib = new int[n +1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i =2; i<= n; i++) {
            fib[i] = fib[i-1]  + fib[i - 2];
        }
        return fib[n];
    }

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        int n = 10;
        System.out.println("Fibonacci of " + n + " (recursive) : " + fib.fibRecursive(n));
        System.out.println("Fibonacci of " + n + " (dynamic programming) : " + fib.fibDynamic(n));
    }
}
