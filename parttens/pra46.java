public class pra46 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {

                if (i == 1 || j == 1 || i == 4 || j == 4) {
                    System.out.print("1\t");
                } else {
                    System.out.print(i*j+"\t");
                }
            }
            System.out.println("");
        }
    }
}
