import java.util.*;
public class pra17 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number that you want to find series sum:");
        int n = sc.nextInt();
        int sum = 0,i=1;
        while(i<=n){
        sum+=i;
            System.out.print(i+"+");
            i++;

            
        }
        System.out.println("\b="+sum);
    }
}
