import java.util.*;
public class pra10 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Area of:\n Select your Option:\n1.Area of Square\n 2.Area of Rectangle\n 3.Area of Circle\n 4.Area of Triangle\n 5.Area of Cyclinder");
        int opt = sc.nextInt();
        if(opt == 1){
            System.out.println("Enter side of square:");
            int side = sc.nextInt();
            System.out.println("Area of square:"+ side*side);
        } else if(opt == 2){
            System.out.println("Enter length of rectangle:");
            int l = sc.nextInt();
            System.out.println("Enter braedth of rectangle:");
            int b = sc.nextInt();
            System.out.println("Area of rectangle:"+ l*b);
        } else if(opt == 3){
            System.out.println("Enter Radius of circle:");
            int r = sc.nextInt();
            System.out.println("Area of circle:"+ 3.14*r*r);
        }else if(opt == 4){
            System.out.println("Enter height of triangle:");
            int h = sc.nextInt();
            System.out.println("Enter base of triangle:");
            int b = sc.nextInt();
            System.out.println("Area of triangle:"+ 1/2 * (h*b));
        }
        else if(opt == 5){
            System.out.println("Enter height:");
            int h = sc.nextInt();
            System.out.println("Enter radius:");
            int r = sc.nextInt();
            System.out.println("Area of cylinder:"+ 2*3.14*r*(r+h));
        } else {
            System.out.println("You had enterd invalid option");
        }

        sc.close();


    }
}
