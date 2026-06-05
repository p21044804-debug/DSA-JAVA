 import java.util.*;

public class pra14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int no = sc.nextInt();
        int a = 0, b = 1, c = 0;
        for(int i=0;i <= no;i++) {

            c = c + a;
            a = b;
            b = c;
            System.out.print(c + " ");
        }

    }
} 
