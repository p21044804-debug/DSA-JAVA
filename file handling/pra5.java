import java.util.*;
import java.io.*;

public class pra5 {
    public static void main(String[] args) {
        File fp = new File("C:\\Users\\admin\\OneDrive\\Desktop\\depple\\java\\file handling\\emp.txt");
        try {
            if (fp.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File is not created successfully");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            FileWriter fw = new FileWriter("C:\\Users\\admin\\OneDrive\\Desktop\\depple\\java\\file handling\\emp.txt");
            fw.write("import java.util.Scanner;\r\n" + //
                                "\r\n" + //
                                "class salary {\r\n" + //
                                "    Scanner sc = new Scanner(System.in);\r\n" + //
                                "    double net_salary, gross, deduction, basic, da, hra, pf, medical, insurance;\r\n" + //
                                "    String name;\r\n" + //
                                "\r\n" + //
                                "    public void ReadData() {\r\n" + //
                                "        System.out.println(\"Enter the employee name:\");\r\n" + //
                                "        name = sc.nextLine();\r\n" + //
                                "        System.out.println(\"Enter the basic salary:\");\r\n" + //
                                "        basic = sc.nextInt();\r\n" + //
                                "        da = basic * (0.5);\r\n" + //
                                "        hra = basic * (0.1);\r\n" + //
                                "        medical = basic * (0.04);\r\n" + //
                                "        gross = basic + da + hra + medical;\r\n" + //
                                "        pf = gross * (0.05);\r\n" + //
                                "        insurance = gross * (0.05);\r\n" + //
                                "        deduction = insurance + pf;\r\n" + //
                                "        net_salary = gross - deduction;\r\n" + //
                                "    }\r\n" + //
                                "\r\n" + //
                                "    void ShowData() {\r\n" + //
                                "\r\n" + //
                                "       \r\n" + //
                                "        System.out.println(name+\"\\t\"+basic+ \"\\t\" + da + \"\\t\" + hra + \"\\t\" + medical + \"\\t\" + gross + \"\\t\" + pf + \"\\t\" + insurance+ \"\\t\" + deduction + \"\\t\" + net_salary);\r\n" + //
                                "    }\r\n" + //
                                "}\r\n" + //
                                "\r\n" + //
                                "public class pra4 {\r\n" + //
                                "    public static void main(String[] args) {\r\n" + //
                                "        Scanner sc = new Scanner(System.in);\r\n" + //
                                "        System.out.println(\"how many employee you want to enter:\");\r\n" + //
                                "        int emp = sc.nextInt();\r\n" + //
                                "        salary[] s = new salary[emp];\r\n" + //
                                "        for (int i = 0; i < s.length; i++) {\r\n" + //
                                "            System.out.println(\"\\n" + //
                                "Enter emp salary \" + (i + 1) + \":\");\r\n" + //
                                "            s[i] = new salary();\r\n" + //
                                "            s[i].ReadData();\r\n" + //
                                "\r\n" + //
                                "        }\r\n" + //
                                "\r\n" + //
                                "                System.out.println(\"Name\\tbasic\\tda\\thra\\tmedical\\tgross\\tpf\\tinsurance\\tdeduction\\tnet_salary\");\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "        for (salary empSalary : s) {\r\n" + //
                                "\r\n" + //
                                "\r\n" + //
                                "            empSalary.ShowData();\r\n" + //
                                "            System.out.println(\"==========================================================\");\r\n" + //
                                "        }\r\n" + //
                                "    }\r\n" + //
                                "}");

            fw.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        

        try {
            Scanner sc =new Scanner(fp);
            while (sc.hasNextLine()) {
                String FileData =sc.nextLine();
                System.out.println(FileData);
                
            }
            sc.close();
        } catch (Exception e) {
           System.err.println(e.getMessage());
           e.printStackTrace();
        }
    }

}
