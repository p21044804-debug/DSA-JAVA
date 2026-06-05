//suppers small
import java.util.*;
public class str13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String :");
        String str = sc.nextLine();
        int length=str.length();
        char cha[] = str.toCharArray();
        String result = "";
        String small = "";
        String nor = "";
        
       
        for (int i = 0; i < length; i++) {
            char ch = cha[i];
            if(ch>='a' && ch<='z'){
                small=small+(char)(ch);
            }
            else{
                 nor=nor+(char)(ch);
            }
        }
        result=nor+small;
        System.out.println(result);
        
      
    }
}
