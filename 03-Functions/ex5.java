// Ques sum=odd

import java.util.*;

public class ex5 {

    public static int sumofOddNum(int n) {
        int i, sum = 0;
        for (i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sumofOddNum(n));
    }
}
