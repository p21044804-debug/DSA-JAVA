//from 1 to 1000 no. armstrong
import java.util.Scanner;

public class pra31 {
    public static void main (String args[]){
        
                int n = 1;
                
            
    
            while(n<=1000){
                // System.out.println(n);
                n++;
                int result=0,temp = n;
                int ori_num=n;
                while(temp!=0){
               int rev=temp%10;
                result=result+(rev*rev*rev);
                temp=temp/10;
                }
                if(result == ori_num)
                System.out.println(result);
            }
            
            
                
            
    }
}
