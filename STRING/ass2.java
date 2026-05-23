import java.util.*;
public class ass2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter input");
         String str = sc.nextLine();
         System.out.println("You have enter:"+str);
         str=str.toUpperCase();
         int c =0;
         for(int i = 0;i<str.length();i++){
            for(int j = 0;j<=i;j++){
               if(c<str.length()){
                 System.out.print(str.charAt(c)+" ");
                c++;
               }
               else{
                System.out.print("* ");
               }
            }
            System.out.println();
            if(c>=str.length()){
                break;
            }

         }

    }
}
