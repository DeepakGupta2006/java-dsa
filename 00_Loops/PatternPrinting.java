package loops;

/**
 * Problem: Pattern Printing using Loops
 * Prints a right-angled triangle pattern of stars using nested loops.
 *
 * Example (n = 5):
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */
public class PatternPrinting {

    public void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PatternPrinting solution = new PatternPrinting();
        solution.printTriangle(5);
    }
}
