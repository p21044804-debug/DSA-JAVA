public class pra33 {
    public static void main(String[] args) {
        for (int row = 1;row<=4;row++){
            for (int space = 1; space <row ; space++) {
                System.out.print("  ");
            }
            for(int col =4;col>=row;col--){
                System.out.print(col+" ");
            }
            System.out.println("");
        }
    }
}
