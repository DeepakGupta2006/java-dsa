
import java.util.Scanner;

public class Variables {

    public static void main(String[] args) {

        int age = 21;
        double prize = 35.50;

        int a = 10;
        int b = 25;
        int sum = a + b;

        System.out.println("Sum = " + sum);

        // input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int c = sc.nextInt();

        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.println("Name: " + name);
        System.out.println("Number: " + c);

        sc.close();
    }
}
