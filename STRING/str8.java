import java.util.*;
public class str8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String :");
        String str = sc.nextLine();
        int ascii = 0;
         System.out.println("Enter key from 1 to 7 that you want to decrypt");
        int key = sc.nextInt();
        int na=0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            ascii = (int) ch;
             na=ascii-key;
            char chh = (char) na;
            System.out.print(chh);
        }
        
      
    }
}
