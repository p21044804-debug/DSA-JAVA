public class ass4 {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= 5; row++) {
            for (int space = 1; space <= 6 - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                if (row == 6 || col == row|| row == 2 || col == 1 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        for (int row = 5; row >= 1; row--) {
            for (int space = 1; space <= 6 - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                if (row == 6 || col == row|| row == 2 || col == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        

        
    }
    
}
