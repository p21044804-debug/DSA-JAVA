import java.util.*;
public class pra1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.print(i);
            if(i<n){
                System.out.print(",");
            }
           
        }
    }
}
