import java.util.*;
public class pra18 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number that you want to find factorial:");
        int n = sc.nextInt();
        int multiply = 1,i=1;
        while(i<=n){
            multiply*=i;
            i++;
        }
        System.out.println("\b="+multiply);
        sc.close();
    }
}
