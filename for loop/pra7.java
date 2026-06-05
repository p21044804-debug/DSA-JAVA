import java.util.*;
public class pra7 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            if(i%3==0 && i%7==0){
                System.out.print(i+" ");
                
            }
        }
    }
}
