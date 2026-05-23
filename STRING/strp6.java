import java.util.Scanner;

public class strp6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();

        for (int row = 4;row>=0;row--){
            for (int space = 1; space <=4-row ; space++) {
                System.out.print(" ");
            }
            for(int col =0;col<=row;col++){
                System.out.print(str.charAt(col)+" ");
            }
            System.out.println("");
        }
    }
}
