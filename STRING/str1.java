import java.util.*;
public class str1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = sc.nextLine();
        System.out.println("Your name is:"+name);
        int length = name.length();
        System.out.println("String length:"+length);
    }
}
