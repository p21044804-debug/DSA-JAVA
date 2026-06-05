//fibonacci
import java.util.*;

public class pra27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int no = sc.nextInt();
        int a = 0, b = 1, c = 0;
     int i = 1;
        while (i <= no) {

            c = c + a;
            a = b;
            b = c;
            System.out.print(c + " ");
i++;
        }

    }
}
