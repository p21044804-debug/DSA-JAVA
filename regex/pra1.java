import java.util.*;
import java.util.regex.*;

public class pra1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String Name;
        String Mobile, Age, Password, Email;
        String NamePattern = "[a-zA-Z\\s]{5,50}";
        String MoPattern = "\\d{10}";
        String AgePattern = "\\d{1,3}";
        String PasswordPattern = "^[a-zA-Z0-9_@#$%^&+=!]{8,15}$";
        String EmailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        System.out.println(
                "Note:   1.Only small or capital cases are allowed\n\t2.No numbers or symbols allowed\n\t3.Name length min:5 & maximum:50");
        while (true) {
            System.out.print("Enter name: ");
            Name = sc.nextLine();

            if (Pattern.matches(NamePattern, Name)) {
                System.out.println("Valid Input");
                break;
            } else {
                System.out.println("Invalid Input. Please try again.");
            }
        }
        while (true) {
            System.out.print("Enter Mobile Number: ");
            Mobile = sc.nextLine();

            if (Pattern.matches(MoPattern, Mobile)) {
                System.out.println("Valid Mobile Number");
                break;
            } else {
                System.out.println("Invalid Mobile Number. Must be exactly 10 digits.");
            }
            sc.close();
        }

        while (true) {
            System.out.print("Enter Age Number: ");
            Age = sc.nextLine();

            if (Pattern.matches(AgePattern, Age)) {
                System.out.println("Valid Age");
                break;
            } else {
                System.out.println("Invalid Age . Age Must be in 1 to digits ");
            }
        }

        while (true) {
            System.out.println(
                    "Invalid Password . Must between 8 to 15 digits & must content Uppercase,Lowercase,Numbers,And special charater:");
            System.out.print("Enter Password: ");
            Password = sc.nextLine();

            if (Pattern.matches(PasswordPattern, Password)) {
                System.out.println("Password is valid");
                break;
            } else {
                System.out.println(
                        "Invalid Password . Must between 8 to 15 digits & must content Uppercase,Lowercase,Numbers,And special charater: ");
            }
        }

        while (true) {
            System.out.print("Enter Email: ");
            Email = sc.nextLine();

            if (Pattern.matches(EmailPattern, Email)) {
                System.out.println("Valid Email");
                break;
            } else {
                System.out.println("Invalid Email. Try again.");
            }

           
        }

        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("Name:"+Name+"\nMobile:"+Mobile+"\nAge:"+Age+"\nPassword: ********"+"\nPassword is Hidden\nEmail: "+Email);
        System.out.println("-----------------------------------------------------------------------------------------------------");































        
         sc.close();
    }
}