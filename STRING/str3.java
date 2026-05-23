import java.util.Scanner;

public class str3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String b = sc.nextLine();

        System.out.println("Enter find Character:");
        char a = sc.next().charAt(0);
        int char_count = 0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) ==a ) {
                System.out.println(a+ " is at index:" + i);
                char_count++;
            }
        }
        System.out.println("total character founded:" + char_count);

    }

}
