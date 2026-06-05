import java.util.*;
public class str5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        int length=name.length();
        for (int i = length-1; i>=0; i--) {
            System.out.print(name.charAt(i));
        }

    }
}
