import java.util.Scanner;

public class arr2d8 {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print("Enter values in arr:[" + i + "] [" + j + "]");
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print("Enter values in arr:[" + i + "] [" + j + "]");
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
               c[i][j]=a[i][j]+b[i][j];
            }
            System.out.println("");
        }
        System.out.println("\n\n\n");

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");

        }

        sc.close();

    }
}

