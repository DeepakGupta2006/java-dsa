
public class pat5 {

    public static void main(String[] args) {
        int n = 5;

        // outer
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
// reverse half pyramid numbers //

// for (int i = 1; i <= n; i++) {
//      
//            for (int j = 1; j <= n - i + 1; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
