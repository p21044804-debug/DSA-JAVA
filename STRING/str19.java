import java.util.*;
public class str19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        System.out.println("PLease enter word:");
        String word = sc.nextLine();
        System.out.println("Enter new character position:");
        int pos = sc.nextInt();
        String result = "";
        
        for(int i = 0;i<str.length();i++){
            if(i==pos){
                result+=word;
            }
            result+=str.charAt(i);

            if(pos==str.length()){
                result+=word;
            }
        }
        System.out.println(result);
    }
    
}
