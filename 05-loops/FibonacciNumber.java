
import java.util.Scanner;

public class FibonacciNumber {

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        FibonacciNumber obj = new FibonacciNumber();

        System.out.println("Fibonacci number: " + obj.fib(n));

        sc.close();
    }
}
