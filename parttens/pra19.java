public class pra19 {
    public static void main(String[] args) {
        for (int i = 4; i >= 1; i--) {
            for (int space = 1; space <= 4 - i; space++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
