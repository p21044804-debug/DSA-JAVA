import java.util.*;
import java.io.*;

public class pra2 {
    public static void main(String[] args) {
        File fp = new File("C:\\Users\\admin\\OneDrive\\Desktop\\depple\\java\\file handling\\Marksheet.txt");
        try {
            
            if (fp.createNewFile()) {
                System.out.println("File is successfully created");
            } else {
                System.out.println("File is not created");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            FileWriter fpwrite = new FileWriter("C:\\Users\\admin\\OneDrive\\Desktop\\depple\\java\\file handling\\Marksheet.txt");
            fpwrite.write("import java.util.*;\r\n" + //
                    "\r\n" + //
                    "class Student {\r\n" + //
                    "    Scanner sc = new Scanner(System.in);\r\n" + //
                    "    String name,grade;\r\n" + //
                    "    int roll;\r\n" + //
                    "    int maths, chemistry, physics, computer, english,total;\r\n" + //
                    "    double percentage;\r\n" + //
                    "\r\n" + //
                    "    void ReadData() {\r\n" + //
                    "        System.out.print(\"Enter your roll number: \");\r\n" + //
                    "        roll = sc.nextInt();\r\n" + //
                    "        sc.nextLine();  // Consume newline after integer input\r\n" + //
                    "        System.out.print(\"Enter your name: \");\r\n" + //
                    "        name = sc.nextLine();\r\n" + //
                    "        System.out.print(\"Enter maths marks: \");\r\n" + //
                    "        maths = sc.nextInt();\r\n" + //
                    "        System.out.print(\"Enter chemistry marks: \");\r\n" + //
                    "        chemistry = sc.nextInt();\r\n" + //
                    "        System.out.print(\"Enter physics marks: \");\r\n" + //
                    "        physics = sc.nextInt();\r\n" + //
                    "        System.out.print(\"Enter computer marks: \");\r\n" + //
                    "        computer = sc.nextInt();\r\n" + //
                    "        System.out.print(\"Enter english marks: \");\r\n" + //
                    "        english = sc.nextInt();\r\n" + //
                    "\r\n" + //
                    "        total = maths + chemistry + physics + computer + english;\r\n" + //
                    "        percentage = total / 5.0;\r\n" + //
                    "\r\n" + //
                    "        // Determine grade\r\n" + //
                    "        if (percentage >= 90)\r\n" + //
                    "            grade = \"A+\";\r\n" + //
                    "        else if (percentage >= 80)\r\n" + //
                    "            grade = \"A\";\r\n" + //
                    "        else if (percentage >= 70)\r\n" + //
                    "            grade = \"B\";\r\n" + //
                    "        else if (percentage >= 60)\r\n" + //
                    "            grade = \"C\";\r\n" + //
                    "        else if (percentage >= 50)\r\n" + //
                    "            grade = \"D\";\r\n" + //
                    "        else\r\n" + //
                    "            grade = \"F\";\r\n" + //
                    "    }\r\n" + //
                    "\r\n" + //
                    "\r\n" + //
                    "        \r\n" + //
                    "    \r\n" + //
                    "\r\n" + //
                    "    void ShowData() {\r\n" + //
                    "        System.out.printf(roll+\"\\t\"+name+\"\\t\"+maths+\"\\t\" + chemistry+\"\\t\" + physics+\"\\t\" + computer+\"\\t\" + english+\"\\t\"+total+\"\\t\"+percentage+\"\\t\"+grade);\r\n"
                    + //
                    "    }\r\n" + //
                    "}\r\n" + //
                    "\r\n" + //
                    "public class pra1 {\r\n" + //
                    "    public static void main(String[] args) {\r\n" + //
                    "        Scanner sc = new Scanner(System.in); \r\n" + //
                    "        System.out.print(\"Enter the number of students: \");\r\n" + //
                    "        int no = sc.nextInt();\r\n" + //
                    "        Student[] s = new Student[no];\r\n" + //
                    "\r\n" + //
                    "        for (int i = 0; i < s.length; i++) {\r\n" + //
                    "            System.out.println(\"\\n" + //
                    "Enter details for student \" + (i + 1) + \":\");\r\n" + //
                    "            s[i] = new Student();\r\n" + //
                    "            s[i].ReadData();\r\n" + //
                    "        }\r\n" + //
                    "\r\n" + //
                    "        System.out.println(\"\\n" + //
                    "Roll\\tName\\tMaths\\tChemistry\\tPhysics\\tComputer\\tEnglish\\tTotal\\tPercentage\\tGrade\");\r\n"
                    + //
                    "        for (Student student : s) {\r\n" + //
                    "            student.ShowData();\r\n" + //
                    "        }\r\n" + //
                    "    }\r\n" + //
                    "}\r\n" + //
                    "");
                    fpwrite.close();
                    System.out.println("content added Successfully");
        } catch (Exception e) {
           System.err.println(e.getMessage());
           e.printStackTrace();
        }

        try {
            Scanner sc = new Scanner(fp);
            while (sc.hasNextLine()) {
                String fileData = sc.nextLine();
                System.out.println(fileData);
            }
            sc.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
           e.printStackTrace();
        }
    }
}
