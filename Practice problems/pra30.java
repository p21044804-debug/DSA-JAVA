import java.util.*;
class pra30{
    public static void main (String args[]){
        
            Scanner sc = new Scanner(System.in);
                System.out.println("enter number");
                int n = sc.nextInt();
                int ori_num=n;
            int result=0;
    
            while(n!=0){
               int rev=n%10;
                result=result+(rev*rev*rev);
                n=n/10;
            }
            
            if(result==ori_num){
                System.out.println("Number is armstrong");
            } else{
                System.out.println("Number is not armstrong");
            }
            
    }
}