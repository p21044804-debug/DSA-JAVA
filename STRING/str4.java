import java.util.Scanner;

public class str4 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String b = sc.nextLine();
        int length=b.length();

        System.out.println("Enter Replace Character:");
        char a = sc.next().charAt(0);

         System.out.println("Enter old Character:");
        char d = sc.next().charAt(0);

        char []c =new char[length] ;
        for (var i = 0; i < length; i++) {
            c[i]=b.charAt(i);
            
        }
        for (int i = 0; i < length ; i++) {
            if (c[i] ==d ) {
                c[i]=a;
            }
        }
        b=new String(c);
        System.out.println("total character founded:" +b);
    }
}
