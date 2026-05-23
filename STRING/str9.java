//upper case
import java.util.*;
public class str9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String :");
        String str = sc.nextLine();
        char ascii = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            ascii = (char) ch;
            if(ch>='a' && ch<='z'){
                ascii-=32;
                System.out.print(ascii);
            }
            else{
                System.out.print(ascii);
            }
        }
        
      
    }
}
