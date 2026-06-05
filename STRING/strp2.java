import java.util.Scanner;

public class strp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            for (int space = 1; space <str.length() - i; space++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(str.charAt(j) + " ");
            }
            System.out.println("");
        }
    }
}
