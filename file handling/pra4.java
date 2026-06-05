import java.util.*;
import java.io.*;

public class pra4 {
    public static void main(String[] args) {
        File fp = new File("C:\\Users\\admin\\OneDrive\\Desktop\\depple\\java\\file handling\\multiShopping.txt");
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
            FileWriter fw = new FileWriter("C:\\Users\\admin\\OneDrive\\Desktop\\depple\\java\\file handling\\multiShopping.txt");
            fw.write("import java.util.Scanner;\r\n" + //
                                "\r\n" + //
                                "class customers {\r\n" + //
                                "    Scanner sc = new Scanner(System.in);\r\n" + //
                                "    String customer_name;\r\n" + //
                                "    String[] product_name;\r\n" + //
                                "    float[] product_price;\r\n" + //
                                "    int[] product_qty;\r\n" + //
                                "    int[] dis_amt;\r\n" + //
                                "    float[] net_tot, total, discount;\r\n" + //
                                "\r\n" + //
                                "    void ReadData() {\r\n" + //
                                "        System.out.println(\"Please enter customer name:\");\r\n" + //
                                "        customer_name = sc.nextLine();\r\n" + //
                                "\r\n" + //
                                "        System.out.print(\"Enter the number of items: \");\r\n" + //
                                "        int itemNo = sc.nextInt();\r\n" + //
                                "\r\n" + //
                                "        product_name = new String[itemNo];\r\n" + //
                                "        product_price = new float[itemNo];\r\n" + //
                                "        product_qty = new int[itemNo];\r\n" + //
                                "        dis_amt = new int[itemNo];\r\n" + //
                                "        net_tot = new float[itemNo];\r\n" + //
                                "        total = new float[itemNo];\r\n" + //
                                "        discount = new float[itemNo];\r\n" + //
                                "\r\n" + //
                                "        for (int i = 0; i < itemNo; i++) {\r\n" + //
                                "            System.out.println(\"\\n" + //
                                "Enter details for item \" + (i + 1) + \":\");\r\n" + //
                                "            System.out.print(\"Product name: \");\r\n" + //
                                "            product_name[i] = sc.nextLine();\r\n" + //
                                "            System.out.print(\"Product price: \");\r\n" + //
                                "            product_price[i] = sc.nextFloat();\r\n" + //
                                "            System.out.print(\"Product quantity: \");\r\n" + //
                                "            product_qty[i] = sc.nextInt();\r\n" + //
                                "            sc.nextLine();\r\n" + //
                                "\r\n" + //
                                "            total[i] = product_price[i] * product_qty[i];\r\n" + //
                                "            if (total[i] >= 1500) {\r\n" + //
                                "                discount[i] = total[i] * 15 / 100;\r\n" + //
                                "                dis_amt[i] = 15;\r\n" + //
                                "            } else if (total[i] <= 1500 || total[i] >= 1000) {\r\n" + //
                                "                discount[i] = total[i] * 10 / 100;\r\n" + //
                                "                dis_amt[i] = 10;\r\n" + //
                                "            } else if (total[i] <= 1000 || total[i] >= 500) {\r\n" + //
                                "                discount[i] = total[i] * 5 / 100;\r\n" + //
                                "                dis_amt[i] = 5;\r\n" + //
                                "            } else {\r\n" + //
                                "                discount[i] = total[i] * 2 / 100;\r\n" + //
                                "                dis_amt[i] = 2;\r\n" + //
                                "            }\r\n" + //
                                "            net_tot[i] = total[i] - discount[i];\r\n" + //
                                "\r\n" + //
                                "        }\r\n" + //
                                "    }\r\n" + //
                                "\r\n" + //
                                "    void ShowData() {\r\n" + //
                                "\r\n" + //
                                "        for (int i = 0; i < product_name.length; i++) {\r\n" + //
                                "            System.out.println(\r\n" + //
                                "                    product_name[i] + \"\\t\" + total[i] + \"\\t\" + dis_amt[i] + \"\\t\" + discount[i] + \"\\t\" + net_tot[i]);\r\n" + //
                                "        }\r\n" + //
                                "    }\r\n" + //
                                "}\r\n" + //
                                "\r\n" + //
                                "public class pra3 {\r\n" + //
                                "    public static void main(String[] args) {\r\n" + //
                                "        Scanner sc = new Scanner(System.in);\r\n" + //
                                "        System.out.print(\"Enter the number of customers: \");\r\n" + //
                                "        int no = sc.nextInt();\r\n" + //
                                "\r\n" + //
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
                                "        System.out.println(\"\\n" + //
                                "================== Total Bill ==================\");\r\n" + //
                                "\r\n" + //
                                "        for (customers cus : cs) {\r\n" + //
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

