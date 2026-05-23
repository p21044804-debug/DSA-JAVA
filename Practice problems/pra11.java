import java.util.*;

public class pra11 {
    public static void main(String[] args) {
        int right=0,wrong=0,skip=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Q - 5 X 2 = ?");
        System.out.println("Select option:\na=8\nb=9\nc=10\nd=skip\n");
        char n = sc.next().charAt(0);
        System.out.println("Enter your choice");

        if (n == 'a') {
            System.out.println("is wrong choice");
            wrong++;
        } else if (n == 'b') {
            System.out.println("9 is wrong choice");
            wrong++;
        } else if (n == 'c') {
            System.out.println("10 is right choice");
            right++;

        } else {
            System.out.println(" skip");
            skip++;
        }
        // q2
        System.out.println("Q2 - 5 X 5 = ?");
        System.out.println("Select option:\na=8\nb=9\nc=25\nd=skip\n");
        char n1 = sc.next().charAt(0);
        System.out.println("Enter your choice");

        if (n1 == 'a') {
            System.out.println("is wrong choice");
            wrong++;
        } else if (n1 == 'b') {
            System.out.println("9 is wrong choice");
            wrong++;
        } else if (n1 == 'c') {
            System.out.println("25 is right choice");
            right++;
        } else {
            System.out.println(" skip");
            skip++;
        }
        //3
        System.out.println("Q - 2 X 2 = ?");
        System.out.println("Select option:\na=8\nb=9\nc=4\nd=skip\n");
        char n3 = sc.next().charAt(0);
        System.out.println("Enter your chioce");

        if (n3 == 'a') {
            System.out.println("8 is wrong choice");
            wrong++;
        } else if (n3 == 'b') {
            System.out.println("9 is wrong choice");
            wrong++;
        } else if (n3 == 'c') {
            System.out.println("4 is right choice");
            right++;
        } else {
            System.out.println(" skip");
            skip++;
            
        }
        //4
        System.out.println("Q - 2 X 3 = ?");
        System.out.println("Select option:\na=8\nb=9\nc=6\nd=skip\n");
        char n4 = sc.next().charAt(0);
        System.out.println("Enter your choice");

        if (n4 == 'a') {
            System.out.println("8 is wrong choice");
            wrong++;
        } else if (n4 == 'b') {
            System.out.println("9 is wrong choice");
            wrong++;
        } else if (n4 == 'c') {
            System.out.println("6 is right choice");
            right++;
        } else {
            System.out.println(" skip");
            skip++;
        }
         //4
         System.out.println("Q - 3 X 3 = ?");
         System.out.println("Select option:\na=8\nb=9\nc=6\nd=skip\n");
         char n5 = sc.next().charAt(0);
         System.out.println("Enter your choice");
 
         if (n5 == 'a') {
             System.out.println("8 is wrong choice");
             wrong++;
         } else if (n5 == 'b') {
             System.out.println("9 is right choice");
             right++;
         } else if (n5 == 'c') {
             System.out.println("6 is wrong choice");
             wrong++;
         } else {
             System.out.println(" skip");
             skip++;
         }
        sc.close();
        System.out.println("Total right+"+right+"\ntotal skips"+skip+"\ntotal wrong\n"+wrong);
        int tot_marks=(right*10)-(wrong*5);
        System.out.println("total marks are:"+tot_marks);
    }
    

}
