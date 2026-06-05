import java.util.*;
public class pra12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your choice\n1.SUNDAY\n2.MONDAY\n3.TUESDAY\n4.WEDNESSDAY\n5.THRUSDAY\n6.FRIDAY\n7.SATURDAY");
        System.out.println("Enter your choice");
        int day = sc.nextInt();

        if (day == 1) {
            System.out.println("Sunday");
        } else if (day == 2) {
            System.out.println("Monday");
        } else if (day == 3) {
            System.out.println("Tuesday");
        } else if (day == 4) {
            System.out.println("Wednessday");
        } else if (day == 5) {
            System.out.println("Thrusday");
        } else if (day == 6) {
            System.out.println("Friday");
        } else if (day == 7) {
            System.out.println("Saturday");
        } 
        else {
            System.out.println("You had enterd invalid option");
        }
        sc.close();
    }
}
