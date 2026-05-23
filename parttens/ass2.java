public class ass2 {
    public static void main(String[] args) {
        for (int row = 1;row<=5;row++){
           for(int space=1;space<=5-row;space++){
            System.out.print(" ");
           }
            for(int col =1;col<=5;col++){
                if(row ==5 || col==row ||row==col||col==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
