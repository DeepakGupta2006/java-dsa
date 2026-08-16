package dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Fibonacci with Memoization
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class FibonacciMemo {

    private final Map<Integer, Long> memo = new HashMap<>();

    public long fib(int n) {
        if (n <= 1) return n;
        if (memo.containsKey(n)) return memo.get(n);
        long result = fib(n - 1) + fib(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        FibonacciMemo solution = new FibonacciMemo();
        System.out.println("fib(30) = " + solution.fib(30));
    }
}
