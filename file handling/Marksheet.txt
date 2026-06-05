import java.util.*;

class Student {
    Scanner sc = new Scanner(System.in);
    String name,grade;
    int roll;
    int maths, chemistry, physics, computer, english,total;
    double percentage;

    void ReadData() {
        System.out.print("Enter your roll number: ");
        roll = sc.nextInt();
        sc.nextLine();  // Consume newline after integer input
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter maths marks: ");
        maths = sc.nextInt();
        System.out.print("Enter chemistry marks: ");
        chemistry = sc.nextInt();
        System.out.print("Enter physics marks: ");
        physics = sc.nextInt();
        System.out.print("Enter computer marks: ");
        computer = sc.nextInt();
        System.out.print("Enter english marks: ");
        english = sc.nextInt();

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
        System.out.printf(roll+"\t"+name+"\t"+maths+"\t" + chemistry+"\t" + physics+"\t" + computer+"\t" + english+"\t"+total+"\t"+percentage+"\t"+grade);
    }
}

public class pra1 {
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
    }
}
