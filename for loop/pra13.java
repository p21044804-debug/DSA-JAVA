import java.util.*;

public class pra13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number:");
        int n = sc.nextInt();
        double sum = 0.0;
        for(int i=1;i <= n;i++) {
            sum += (double)(1.0 / i);
        }
        System.out.println("=" + sum);

    }
}