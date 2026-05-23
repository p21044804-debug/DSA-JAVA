import java.util.Scanner;

public class strp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        for(int i=str.length();i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print(str.charAt(j)+"\t");
            }
            System.out.println("");
        }


    }
}
