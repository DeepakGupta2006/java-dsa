
import java.util.*;

public class ex8 {

    public static void person(int age) {
        if (age > 18) {
            System.out.println("person is eligible to vote");
        } else {
            System.out.println("person is not eligible to vote");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        person(age);

    }
}
