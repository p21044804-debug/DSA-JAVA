import java.util.*;
public class str2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = sc.nextLine();
        System.out.println("Your name is:"+name);
        int length = name.length();
        System.out.println("String length:"+length);
        int wc =1;
        int vovel = 0;
        for (int i = 0; i < length; i++) {
            char ch = name.charAt(i);
            if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u') {
                vovel++;
            }
            if(ch ==' '){
                wc++;
            }
        }
        System.out.println("Total word:"+wc);
        System.out.println("Total vovels:"+vovel);
        sc.close();

    }
}
