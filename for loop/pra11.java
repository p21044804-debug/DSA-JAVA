import java.util.*;
public class pra11 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number:");
        int n=sc.nextInt();
        boolean isprime = true;
        for (int i = 2;i<=n;i++){
            if (n % i == 0) {
                isprime = false;
            }
        }
        
        if(isprime){
            System.out.println("enter number is not prime");
        }
        else{
            System.out.println("number is prime");
        }
        
    }
}

