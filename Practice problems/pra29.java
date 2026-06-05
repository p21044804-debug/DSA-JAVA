// nevine number1
import java.util.Scanner;

public class pra29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("enter number");
            int n = sc.nextInt();
        int result=0;

        while(n!=0){
           int rev=n%10;
            result=result+rev;
            n=n/10;
        }
        
        if(n%result==0){
            System.out.println("Number is nevine");
        } else{
            System.out.println("Number is not nevine");
        }
        
    }
    
}
