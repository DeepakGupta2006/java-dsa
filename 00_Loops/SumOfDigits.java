package loops;

/**
 * Problem: Sum of Digits using a while loop
 * Given a number, find the sum of its digits.
 *
 * Time Complexity: O(log n) - proportional to number of digits
 * Space Complexity: O(1)
 */
public class SumOfDigits {

    public int sumOfDigits(int num) {
        int sum = 0;
        num = Math.abs(num);
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfDigits solution = new SumOfDigits();
        System.out.println("Sum of digits of 12345: " + solution.sumOfDigits(12345));
    }
}
