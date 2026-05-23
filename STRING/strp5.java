import java.util.Scanner;

public class strp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();

        for (int row = 4;row>=0;row--){
            for (int space = 1; space <=4-row ; space++) {
                System.out.print("  ");
            }
            for(int col =row;col>=0;col--){
                System.out.print(str.charAt(col)+" ");
            }
            System.out.println("");
        }
    }
}

