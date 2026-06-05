
import java.util.*;
public class pra28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("enter number");
            int n = sc.nextInt();
        int result=0;

        while(n!=0){
           int rev=n%10;
            result=result*10+rev;
            n=n/10;
        }
        System.out.println(result);
    }
}
