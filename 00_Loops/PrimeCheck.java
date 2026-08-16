package loops;

/**
 * Problem: Check if a number is Prime using a for loop
 *
 * Time Complexity: O(sqrt(n))
 * Space Complexity: O(1)
 */
public class PrimeCheck {

    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeCheck solution = new PrimeCheck();
        System.out.println("Is 29 prime? " + solution.isPrime(29));
        System.out.println("Is 30 prime? " + solution.isPrime(30));
    }
}
