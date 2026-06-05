import java.util.*;
public class pra23 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int n2 = sc.nextInt();
        int i = 1;
        while(i<=10){
            int j=n1;
            while (j<=n2){
                System.out.print(j+" X "+i+"= "+j*i+" ");
            j++;
            }
            System.out.println(" ");
            i++;
        }
    }
}
 
