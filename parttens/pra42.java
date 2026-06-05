public class pra42 {
    public static void main(String[] args) {
        //upper
        for (int row = 1;row<=3;row++){
            for(int col =1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        //lower
        

        for (int row = 4;row>=1;row--){
            for(int col =1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
