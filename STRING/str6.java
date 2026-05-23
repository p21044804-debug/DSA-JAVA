import java.util.Scanner;

public class str6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String str = sc.nextLine();
        int length = str.length();
        char str1[] = new char[length];

        for (int i = length - 1; i >= 0; i--) {
            str1[i] = str.charAt(i);
        }

        String newName = new String(str1);
        System.out.println(newName);
        System.out.println(str);

        if (str.equals(newName)) {
            System.out.println("Your string is palindrome");
        }
    }

}
