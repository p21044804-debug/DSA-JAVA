

public class pra33 {
    public static void main(String[] args) {
        int n = 1;
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

