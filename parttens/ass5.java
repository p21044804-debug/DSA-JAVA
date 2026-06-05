public class ass5 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 5; row >= 1; row--) {
            for (int space = 1; space <= 5 - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                if (row == 5 || col == row || row == 2 || col == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        

        for (int row = 2; row <= 5; row++) {
            for (int space = 1; space <= 5 - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n; col++) {
                if (row == 5 || col == row || row == col || col == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
