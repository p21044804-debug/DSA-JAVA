import java.util.Scanner;

public class strp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();

        for (int row = 0;row<str.length();row++){
            for (int space = 1; space <=str.length()-row ; space++) {
                System.out.print(" ");
            }
            for(int col =0;col<=row;col++){
                System.out.print(str.charAt(col)+" ");
            }
            System.out.println("");
        }
    }
}
