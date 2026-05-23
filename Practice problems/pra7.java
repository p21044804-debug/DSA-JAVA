import java.util.*;
public class pra7 {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number that you want to check weather it is odd or even.");
        int n = sc.nextInt();
        if((n/2)==0){
            System.out.println("Entered number is even.");
        }
        else {
            System.out.println("Entered number is negative.");
        }

        sc.close();
    }

}
