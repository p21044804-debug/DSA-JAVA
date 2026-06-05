import java.util.*;
public class PrimeCheck {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    return false;
                }
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
                if(isPrime(i)){
                    System.out.print(i+" ");
                }
        }
        System.out.println();
        if(n==1){
            System.out.println("No prime number found");
        }

    }
}
