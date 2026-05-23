import java.util.*;
public class pra6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int a=sc.nextInt();
        System.out.println(" odd even:");
        for(int i=1;i<=a;i++){
            if(i%2!=0){
                System.out.print(" "+i);
            }
            else{
                System.out.println(" "+i);
            }
        }
    }
    
}
