import java.util.*;
public class pra6 {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number that you want to check whether it is positive or negitive:");
        int n = sc.nextInt();
        if(n>0){
            System.out.println("Entered number is positive.");
        }
        else if(n<0){
            System.out.println("Entered number is negetive.");
        }
        else{
            System.out.println("Entered number is zero[0]");
        }
    }
}
