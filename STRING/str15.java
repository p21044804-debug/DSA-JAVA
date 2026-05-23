import java.util.*;
public class str15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        System.out.println("PLease enter character that you want to delete:");
        char ch = sc.next().charAt(0);
        String result = "";
        
        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            if(c==ch){
               continue;
            }
            result+=c;

            
        }
        System.out.println(result);
    }
    
}

