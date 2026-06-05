import java.util.*;
public class pra2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n = sc.nextInt();
        for (int i=n;i>=1;i--){
            
            if(i<n){
                System.out.print(",");
            }
            System.out.print(i);
           
        }
    }
}