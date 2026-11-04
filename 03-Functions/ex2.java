// multiply 2 number return product like tables 2x1=2

import java.util.*;

public class ex2 {

    public static float calculatepro(int a, int b) {

        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(calculatepro(a, b));

    }
}
