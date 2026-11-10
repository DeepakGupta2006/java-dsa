// circumference of circle radius

import java.util.*;

public class ex7 {

    public static double circumference(int R) {
        return 2 * Math.PI * R;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();

        System.out.println(circumference(R));

    }
}
