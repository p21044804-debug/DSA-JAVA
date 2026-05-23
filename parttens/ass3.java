public class ass3 {
    public static void main(String[] args) {
        int n=5;
        for (int row = 1;row<=5;row++){
           for(int space=1;space<=5-row;space++){
            System.out.print(" ");
           }
            for(int col =1;col<=n;col++){
                if(row ==1 || col==row ||row==col||col==5){
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