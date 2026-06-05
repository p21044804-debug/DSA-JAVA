import java.util.*;
public class pra14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
        sc.close();
    }
}