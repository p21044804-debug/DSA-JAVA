import java.util.*;
public class pra16 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int n1 = sc.nextInt();
        System.out.println("Please enter second number:");
        int n2 = sc.nextInt();

        int i = n1;
        while (i<=n2) {
            System.out.print(i+" ");
            i++;
        }
    }
}
