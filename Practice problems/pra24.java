import java.util.*;
public class pra24 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number:");
        int n=sc.nextInt();
        boolean isprime = true;
        int i = 2;
        while (i<n) {
            if (n % i == 0) {
                isprime = false;
                break;
            }

            i++;
        }
        
        if(isprime){
            System.out.println("enter number is not prime");
        }
        else{
            System.out.println("number is prime");
        }
        
    }
}
