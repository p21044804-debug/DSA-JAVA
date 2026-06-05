import java.util.*;
public class str16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        int wc =1;
        String result = "";
        
        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            if(wc==1 && c==' '){
               continue;
            }
            wc=0;   
                result = result + c;
           
           

            
        }
        System.out.println(result);
    }
    
}
