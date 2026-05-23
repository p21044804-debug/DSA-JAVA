import java.util.*;
public class pra5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int a=sc.nextInt();
        int multi=1;
        for(int i=1;i<=a;i++){
            multi*=i;
        }
        System.out.println(multi);
    }
    
}