//suppers capital
import java.util.*;
public class str12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String :");
        String str = sc.nextLine();
        int length=str.length();
        char cha[] = str.toCharArray();
        String result = "";
        String cap = "";
        String nor = "";
        
       
        for (int i = 0; i < length; i++) {
            char ch = cha[i];
            if(ch>='A' && ch<='Z'){
                cap=cap+(char)(ch);
            }
            else{
                 nor=nor+(char)(ch);
            }
        }
        result=nor+cap;
        System.out.println(result);
        
      
    }
}