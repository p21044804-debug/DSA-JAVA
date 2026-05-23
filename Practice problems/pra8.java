import java.util.*;

public class pra8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1 = sc.nextInt();
        System.out.println("Enter second number:");
        int n2 = sc.nextInt();
        System.out.println(
                "Please select a valid option form below:\n 1. Addition\n 2. Substraction\n 3. Multiplication\n 4. Division\n");
        int opt = sc.nextInt();

        if (opt == 1) {
            System.out.println("Sum of two numbers: " + (n1 + n2));
        } else if (opt == 2) {
            System.out.println("substraction of two numbers: " + (n1 - n2));
        } else if (opt == 3) {
            System.out.println("Multiplication of two numbers: " + (n1 * n2));
        }
        else if (opt == 4) {
            System.out.println("division of two numbers: " + (n1 / n2));
        } 
        else {
            System.out.println("You had enterd invalid option");
        }

        sc.close();

    }

}
