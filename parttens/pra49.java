public class pra49{
    public static void main(String[] args) {


        for (int row = 1;row<=3;row++){
            for (int space = 1; space <=4-row ; space++) {
                System.out.print("  ");
            }
            for (int num = 4; num >= 5 - row; num--) {
                System.out.print(num + " ");
            }
            System.out.println("");
        }


        for (int row = 4;row>=1;row--){
            for (int space = 1; space <=4-row ; space++) {
                System.out.print("  ");
            }
            for (int num = 4; num >= 5 - row; num--) {
                System.out.print(num + " ");
            }
            System.out.println("");
        }

        
    }
}