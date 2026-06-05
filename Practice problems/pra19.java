import java.util.*;

public class pra19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number:");
        int n = sc.nextInt();
        int i = 1;
        System.out.print("odd");
        System.out.print("even");
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.print(i + " ");

            }
            System.out.println("");

            if (i % 2 != 0) {
                System.out.print(i + " ");

            }
            i++;
        }
    }
}
