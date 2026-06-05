import java.util.*;

class Student {
            Scanner sc = new Scanner(System.in);
    String name, grade;
    String roll;
    int maths, chemistry, physics, computer, english;
    double percentage, total;

    void ReadData() {
        // name
        while (true) {
            System.out.print("Enter name: ");
            name = sc.nextLine();
            if (name.matches("[A-Za-z ]+")) {
                System.out.println("Valid Input");
                break;
            } else {
                System.out.println("Invalid Input. Please enter alphabetic characters only.");
            }
        }

        // roll number
        while (true) {
            System.out.print("Enter your roll number: ");
            roll = sc.nextLine();
            if (roll.matches("\\d+")) {
                System.out.println("Valid Input");
                break;
            } else {
                System.out.println("Invalid Input. Please enter digits only.");
            }
        }

        // maths marks
        while (true) {
            System.out.print("Enter maths marks: ");
            String input = sc.nextLine();
            if (input.matches("\\d+")) {
                maths = Integer.parseInt(input);
                if (maths >= 0 && maths <= 100) {
                    System.out.println("Valid Input");
                    break;
                }
            }
            System.out.println("Invalid input. Enter a number between 0 and 100.");
        }

        // chemistry marks
        while (true) {
            System.out.print("Enter chemistry marks: ");
            String input = sc.nextLine();
            if (input.matches("\\d+")) {
                chemistry = Integer.parseInt(input);
                if (chemistry >= 0 && chemistry <= 100) {
                    System.out.println("Valid Input");
                    break;
                }
            }
            System.out.println("Invalid input. Enter a number between 0 and 100.");
        }

        // physics marks
        while (true) {
            System.out.print("Enter physics marks: ");
            String input = sc.nextLine();
            if (input.matches("\\d+")) {
                physics = Integer.parseInt(input);
                if (physics >= 0 && physics <= 100) {
                    System.out.println("Valid Input");
                    break;
                }
            }
            System.out.println("Invalid input. Enter a number between 0 and 100.");
        }

        // computer marks
        while (true) {
            System.out.print("Enter computer marks: ");
            String input = sc.nextLine();
            if (input.matches("\\d+")) {
                computer = Integer.parseInt(input);
                if (computer >= 0 && computer <= 100) {
                    System.out.println("Valid Input");
                    break;
                }
            }
            System.out.println("Invalid input. Enter a number between 0 and 100.");
        }

        // english marks
        while (true) {
            System.out.print("Enter english marks: ");
            String input = sc.nextLine();
            if (input.matches("\\d+")) {
                english = Integer.parseInt(input);
                if (english >= 0 && english <= 100) {
                    System.out.println("Valid Input");
                    break;
                }
            }
            System.out.println("Invalid input. Enter a number between 0 and 100.");
        }

        // total and percentage
        total = maths + chemistry + physics + computer + english;
        percentage = total / 5.0;
        // Determine grade
        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 50)
            grade = "D";
        else
            grade = "F";
    }

    void ShowData() {
        System.out.printf(roll + "\t" + name + "\t" + maths + "\t" + chemistry + "\t" + physics + "\t" + computer + "\t"
                + english + "\t" + total + "\t" + percentage + "\t" + grade);
    }
}

public class pra2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int no = sc.nextInt();
        Student[] s = new Student[no];

        for (int i = 0; i < s.length; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            s[i] = new Student();
            s[i].ReadData();
        }

        System.out.println("\nRoll\tName\tMaths\tChemistry\tPhysics\tComputer\tEnglish\tTotal\tPercentage\tGrade");
        for (Student student : s) {
            student.ShowData();
        }
        sc.close();
    }
}
