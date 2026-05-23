import java.util.*;
import java.io.*;

public class pra3 {
    public static void main(String[] args) {
        File fp = new File("C:\\Users\\admin\\OneDrive\\Desktop\\depple\\java\\file handling\\Shopping.txt");
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
            FileWriter fw = new FileWriter("C:\\Users\\admin\\OneDrive\\Desktop\\depple\\java\\file handling\\Shopping.txt");
            fw.write("import java.util.Scanner;\r\n" + //
                    "\r\n" + //
                    "class customers {\r\n" + //
                    "    Scanner sc = new Scanner(System.in);\r\n" + //
                    "    String customer_name, product_name;\r\n" + //
                    "    float product_price;\r\n" + //
                    "    int product_qty;\r\n" + //
                    "    int dis_amt;\r\n" + //
                    "    float net_tot, total, discount;\r\n" + //
                    "\r\n" + //
                    "    void ReadData() {\r\n" + //
                    "        System.out.println(\"Please enter customer name:\");\r\n" + //
                    "        customer_name = sc.nextLine();\r\n" + //
                    "        System.out.println(\"Please enter product name:\");\r\n" + //
                    "        product_name = sc.nextLine();\r\n" + //
                    "        System.out.println(\"Please enter product price:\");\r\n" + //
                    "        product_price = sc.nextInt();\r\n" + //
                    "        System.out.println(\"Please enter product Quntity:\");\r\n" + //
                    "        product_qty = sc.nextInt();\r\n" + //
                    "\r\n" + //
                    "        total = (product_price * product_qty);\r\n" + //
                    "        discount = 0;\r\n" + //
                    "        if (total >= 1500) {\r\n" + //
                    "            discount = total * 15 / 100;\r\n" + //
                    "            dis_amt = 15;\r\n" + //
                    "        } else if (total <= 1500 || total >= 1000) {\r\n" + //
                    "            discount = total * 10 / 100;\r\n" + //
                    "            dis_amt = 10;\r\n" + //
                    "        } else if (total <= 1000 || total >= 500) {\r\n" + //
                    "            discount = total * 5 / 100;\r\n" + //
                    "            dis_amt = 5;\r\n" + //
                    "        } else {\r\n" + //
                    "            discount = total * 2 / 100;\r\n" + //
                    "            dis_amt = 2;\r\n" + //
                    "        }\r\n" + //
                    "        net_tot = total - discount;\r\n" + //
                    "    }\r\n" + //
                    "\r\n" + //
                    "    void ShowData() {\r\n" + //
                    "        String formatted = String.format(\"%.2f\", net_tot);\r\n" + //
                    "\r\n" + //
                    "        System.out.println(\"---------------------------------------------\");\r\n" + //
                    "        System.out.println(customer_name+\"\\t\"+ product_name+\"\\t\" + total+\"\\t\"+ dis_amt + \"%):\\t\" + discount+\"\\t\"+ formatted+\"\\t\");\r\n"
                    + //
                    "    }\r\n" + //
                    "}\r\n" + //
                    "\r\n" + //
                    "public class pra2 {\r\n" + //
                    "    public static void main(String[] args) {\r\n" + //
                    "        Scanner sc = new Scanner(System.in);\r\n" + //
                    "        System.out.print(\"Enter the number of items: \");\r\n" + //
                    "        int no = sc.nextInt();\r\n" + //
                    "        customers[] cs = new customers[no];\r\n" + //
                    "\r\n" + //
                    "        for (int i = 0; i < cs.length; i++) {\r\n" + //
                    "            System.out.println(\"\\n" + //
                    "Enter item \" + (i + 1) + \":\");\r\n" + //
                    "            cs[i] = new customers();\r\n" + //
                    "            cs[i].ReadData();\r\n" + //
                    "\r\n" + //
                    "        }\r\n" + //
                    "\r\n" + //
                    "        System.out.println(\"customer_name\\t product_name\\t total\\t dis_amt (%):\\t discount\\t formatted\\t\");\r\n"
                    + //
                    "        \r\n" + //
                    "        for (customers cus: cs) {\r\n" + //
                    "            cus.ShowData();\r\n" + //
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
