import java.util.*;

public class pra10 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int n2 = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            for(int j=n1;j<=n2;j++){
                System.out.print(j+" X "+i+"= "+j*i+" ");
            }
            System.out.println("");
        }
    }
}
