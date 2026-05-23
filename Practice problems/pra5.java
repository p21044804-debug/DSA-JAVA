import java.util.*;
public class pra5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Enter third number:");
        int c = sc.nextInt();
        if(a==b && b==c && c ==a){
            System.out.println("all values are same");
        }
        else if(a>b && a>c){
            System.out.println(a+ "is maximun then"+b+" and "+c);
        }
        else if(b>a && b>c){
            System.out.println(b+ "is maximun then"+c+" and "+a);
        }
        else {
            System.out.println(c+ "is maximun then"+b+" and "+a);
        }
    }
    
}
