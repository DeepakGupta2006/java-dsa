package recursion;

/**
 * Problem: Factorial using recursion
 * Time Complexity: O(n)
 * Space Complexity: O(n) due to call stack
 */
public class Factorial {

    public long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Factorial solution = new Factorial();
        System.out.println("5! = " + solution.factorial(5));
    }
}
