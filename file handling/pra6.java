import java.util.*;
import java.io.*;

public class pra6 {
    public static void main(String[] args) {
        File fp = new File("C:\\Users\\admin\\OneDrive\\Desktop\\depple\\java\\file handling\\cricketer.txt");
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
            FileWriter fw = new FileWriter("C:\\Users\\admin\\OneDrive\\Desktop\\depple\\java\\file handling\\cricketer.txt");
            fw.write("import java.util.*;\r\n" + //
                                "\r\n" + //
                                "class Cricketer {\r\n" + //
                                "    Scanner sc = new Scanner(System.in);\r\n" + //
                                "    String name;\r\n" + //
                                "    int runs,tot_runs,avg_run;\r\n" + //
                                "\r\n" + //
                                "    void Batsman() {\r\n" + //
                                "\r\n" + //
                                "    \r\n" + //
                                "            System.out.println(\"Enter Batsman name:\");\r\n" + //
                                "            name = sc.nextLine();\r\n" + //
                                "            System.out.println(\"Enter Runs:\");\r\n" + //
                                "            runs = sc.nextInt();\r\n" + //
                                "             System.out.println(\"Enter total Runs:\");\r\n" + //
                                "            tot_runs = sc.nextInt();\r\n" + //
                                "             System.out.println(\"Enter Average Runs:\");\r\n" + //
                                "            avg_run = sc.nextInt();\r\n" + //
                                "        \r\n" + //
                                "        \r\n" + //
                                "    }\r\n" + //
                                "\r\n" + //
                                "    void ShowData() {\r\n" + //
                                "\r\n" + //
                                "        System.out.println(name + \"\\t\" + runs+ \"\\t\" +tot_runs+ \"\\t  \" + avg_run);\r\n" + //
                                "    }\r\n" + //
                                "}\r\n" + //
                                "\r\n" + //
                                "public class pra5 {\r\n" + //
                                "    public static void main(String[] args) {\r\n" + //
                                "\r\n" + //
                                "        Scanner sc = new Scanner(System.in);\r\n" + //
                                "        \r\n" + //
                                "        System.out.println(\"Enter how many player you want to enter\");\r\n" + //
                                "        int playerNo = sc.nextInt();\r\n" + //
                                "\r\n" + //
                                "        Cricketer[] cs = new Cricketer[playerNo];\r\n" + //
                                "        for (int i = 0; i < playerNo; i++) {\r\n" + //
                                "            System.out.println(\"\\n" + //
                                "Enter details of batsman \" + (i + 1) + \":\");\r\n" + //
                                "            cs[i] = new Cricketer();\r\n" + //
                                "            cs[i].Batsman();\r\n" + //
                                "\r\n" + //
                                "        }\r\n" + //
                                "\r\n" + //
                                "        System.out.println(\"\\n" + //
                                "================== Score ==================\");\r\n" + //
                                "        System.out.println(\"name\\truns\\ttot_runs\\tavg_run\");\r\n" + //
                                "\r\n" + //
                                "        for (Cricketer cric : cs) {\r\n" + //
                                "            cric.ShowData();\r\n" + //
                                "        }\r\n" + //
                                "\r\n" + //
                                "        sc.close();\r\n" + //
                                "    }\r\n" + //
                                "}\r\n" + //
                                "");

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
