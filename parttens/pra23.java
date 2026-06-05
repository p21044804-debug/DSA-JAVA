public class pra23 {
    public static void main(String[] args) {
        for (int i = 4; i >=1;i--) {
            for (int space = 1; space <= i; space++) {
                System.out.print("  ");
            }
            for (int j = 4; j >=i; j--) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}