public class pra44 {
    public static void main(String[] args) {

        

        for (int i = 1; i <= 4; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int space=1;space<=4-i;space++){
            System.out.print("1 ");
            }
            System.out.println("");

        }
       

    }

}
