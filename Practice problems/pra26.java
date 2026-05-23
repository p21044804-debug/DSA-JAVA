import java.util.*;

public class pra26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number:");
        int n = sc.nextInt();
        int i = 1;
        double sum = 0.0;
        while (i <= n) {
            sum += (double)(1.0 / i);
            i++;
        }
        System.out.println("=" + sum);

    }
}
