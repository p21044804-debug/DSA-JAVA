import java.util.*;
public class pra21 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            if(i%3==0 || i%7==0){
                System.out.print(i+" ");
                
            }
            i++;
        }
    }
    
}
