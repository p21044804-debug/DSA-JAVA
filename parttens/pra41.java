public class pra41 {
    public static void main(String[] args) {
        //upper
        for (int row = 4;row>=1;row--){
            for (int space = 1; space <=4-row ; space++) {
                System.out.print(" ");
            }
            for(int col =1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        //lower
        

        for (int row = 2;row<=4;row++){
            for (int space = 1; space <=4-row ; space++) {
                System.out.print(" ");
            }
            for(int col =1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
