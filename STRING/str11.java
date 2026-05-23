//toggle
import java.util.*;
public class str11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String :");
        String str = sc.nextLine();
        int length=str.length();
        char cha[] = str.toCharArray();
        String result = "";
        
       
        for (int i = 0; i < length; i++) {
            char ch = cha[i];
            if(ch>='A' && ch<='Z'){
                result=result+(char)(ch+32);
            }
            else if(ch>='a' && ch<='z'  ){
                 result=result+(char)(ch-32);
            }
            else{
                 result=result+(ch);
            }
        }
        System.out.println(result);
        
      
    }
}

