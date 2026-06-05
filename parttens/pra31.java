public class pra31 {
    public static void main(String[] args) {
        for (int row = 4;row>=1;row--){
            for (int space = 1; space <=4-row ; space++) {
                System.out.print("  ");
            }
            for(int col =row;col>=1;col--){
                System.out.print(col+" ");
            }
            System.out.println("");
        }
    }
}
