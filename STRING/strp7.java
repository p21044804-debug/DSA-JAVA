import java.util.Scanner;

public class strp7 {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        int n = str.length();
                // upper
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(str.charAt(j)+" "); 
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 0; j--) {
                if(i==n-1 && j==i){
                    System.out.print(" ");
                    continue;

                }
                System.out.print(str.charAt(j)+" ");
            }
            System.out.println(" ");
        }
        //lower
        for (int i = n-2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(str.charAt(j)+" ");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                
                System.out.print("  ");
            }
            for (int j = i; j >= 0; j--) { 
                System.out.print(str.charAt(j)+" ");
            }
            System.out.println(" ");
        }
    }
}
