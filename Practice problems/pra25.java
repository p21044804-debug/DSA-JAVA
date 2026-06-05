import java.util.*;

public class pra25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number:");
        int n = sc.nextInt();
        int i = 1, sum = 0;
        while (i < n) {
            if (n % i == 0) {
                sum += i;
            }
            i++;
        }
        if (sum == n) {
            System.out.println("Entered number is perfect");
        }
        
    }

}
