import java.util.*;
public class pra22 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int i = 1;
        while(i<=10){
            System.out.println(n+" X "+i+"="+n*i);
            i++;
        }
    }
}
