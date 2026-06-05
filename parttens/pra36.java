public class pra36 {
    public static void main(String[] args) {
        for (int row = 1;row<=4;row++){
            for (int space = 1; space <=4-row ; space++) {
                System.out.print(" ");
            }
            for(int col =1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println("");
        }
    }
}
