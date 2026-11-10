// greatest num those 2 

import java.util.*;

public class ex6 {

    public static void greatestnum(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        greatestnum(a, b);

    }
}
