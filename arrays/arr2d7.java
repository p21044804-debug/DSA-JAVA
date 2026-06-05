import java.util.Scanner;

public class arr2d7 {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int temp[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("Enter values in arr:[" + i + "] [" + j + "]");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
                temp[j][i] = arr[i][j];
            }
            System.out.println("");
        }
        System.out.println("\n\n\n");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println("");

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == temp[i][j]) {

                }
            }

        }
        System.out.print("given matrix is symetrical");
        sc.close();

    }
}
