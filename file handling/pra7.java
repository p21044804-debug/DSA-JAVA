import java.util.*;
import java.io.*;

public class pra7 {
    public static void main(String[] args) {
        File fp = new File("C:\\Users\\admin\\OneDrive\\Desktop\\depple\\java\\file handling\\library.txt");
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
            FileWriter fw = new FileWriter("C:\\Users\\admin\\OneDrive\\Desktop\\depple\\java\\file handling\\library.txt");
            fw.write("import java.util.*;\r\n" + //
                                "\r\n" + //
                                "class Library {\r\n" + //
                                "    Scanner sc = new Scanner(System.in);\r\n" + //
                                "    String[] author;// author name\r\n" + //
                                "    String[] book;// book name\r\n" + //
                                "    int[] price;// book price\r\n" + //
                                "    String[] publisher;// publisher\r\n" + //
                                "    int[] stock;// stock\r\n" + //
                                "    String[] noti;// notification\r\n" + //
                                "\r\n" + //
                                "    void ReadData(int books) {\r\n" + //
                                "        author = new String[books];\r\n" + //
                                "        book = new String[books];\r\n" + //
                                "        price = new int[books];\r\n" + //
                                "        publisher = new String[books];\r\n" + //
                                "        stock = new int[books];\r\n" + //
                                "        noti = new String[books];\r\n" + //
                                "\r\n" + //
                                "        for (int i = 0; i < books; i++) {\r\n" + //
                                "            System.out.println(\"Enter author name:\");\r\n" + //
                                "\r\n" + //
                                "            author[i] = sc.nextLine();\r\n" + //
                                "\r\n" + //
                                "            System.out.println(\"Enter book name:\");//\r\n" + //
                                "            book[i] = sc.nextLine();\r\n" + //
                                "\r\n" + //
                                "            System.out.println(\"Enter book price:\");\r\n" + //
                                "            price[i] = sc.nextInt();\r\n" + //
                                "            sc.nextLine();\r\n" + //
                                "\r\n" + //
                                "            System.out.println(\"Enter publisher name:\");//\r\n" + //
                                "            publisher[i] = sc.nextLine();\r\n" + //
                                "\r\n" + //
                                "            System.out.println(\"Enter stock:\");\r\n" + //
                                "            stock[i] = sc.nextInt();\r\n" + //
                                "            sc.nextLine();\r\n" + //
                                "\r\n" + //
                                "            System.out.println(\"Enter notification:\");\r\n" + //
                                "            noti[i] = sc.nextLine();\r\n" + //
                                "        }\r\n" + //
                                "\r\n" + //
                                "    }\r\n" + //
                                "\r\n" + //
                                "    void ShowData() {\r\n" + //
                                "\r\n" + //
                                "       \r\n" + //
                                "\r\n" + //
                                "        for (int i = 0; i < book.length; i++) {\r\n" + //
                                "            System.out.print((i + 1) + \"\\t\" + author[i] + \"\\t\\t\" + book[i] + \"\\t\\t\" + price[i] + \"\\t\\t\" + publisher[i]\r\n" + //
                                "                    + \"\\t\\t\" + stock[i] + \"\\t\\t\" + price[i] * stock[i] + \"\\t\\t\" + noti[i] + \"\\n" + //
                                "\");\r\n" + //
                                "                     System.out.println(\r\n" + //
                                "                \"_______________________________________________________________________________________________________________________________\");\r\n" + //
                                "        }\r\n" + //
                                "\r\n" + //
                                "        for (int i = 0; i < noti.length; i++) {\r\n" + //
                                "            System.out.println(\"- \" + noti[i] + \" -X\");\r\n" + //
                                "        }\r\n" + //
                                "    }\r\n" + //
                                "\r\n" + //
                                "    void AccendingData() {\r\n" + //
                                "        System.out.println(\"please enter Ascending Order Option by input Enter:\\n" + //
                                " 1. for price \\n" + //
                                " 2. for qty\");\r\n" + //
                                "        int a = sc.nextInt();\r\n" + //
                                "        sc.nextLine();\r\n" + //
                                "\r\n" + //
                                "        if (a == 1) {\r\n" + //
                                "            for (int i = 0; i < book.length; i++) {\r\n" + //
                                "                for (int j = 0; j < book.length - i - 1; j++) {\r\n" + //
                                "                    if (price[j] > price[j + 1]) {\r\n" + //
                                "                        String b = author[j + 1];\r\n" + //
                                "                        author[j + 1] = author[j];\r\n" + //
                                "                        author[j] = b;\r\n" + //
                                "\r\n" + //
                                "                        String c = book[j + 1];\r\n" + //
                                "                        book[j + 1] = book[j];\r\n" + //
                                "                        book[j] = c;\r\n" + //
                                "\r\n" + //
                                "                        int temp = price[j + 1];\r\n" + //
                                "                        price[j + 1] = price[j];\r\n" + //
                                "                        price[j] = temp;\r\n" + //
                                "\r\n" + //
                                "                        String d = publisher[j + 1];\r\n" + //
                                "                        publisher[j + 1] = publisher[j];\r\n" + //
                                "                        publisher[j] = d;\r\n" + //
                                "\r\n" + //
                                "                        int e = stock[j + 1];\r\n" + //
                                "                        stock[j + 1] = stock[j];\r\n" + //
                                "                        stock[j] = e;\r\n" + //
                                "\r\n" + //
                                "                        String f = noti[j + 1];\r\n" + //
                                "                        noti[j + 1] = noti[j];\r\n" + //
                                "                        noti[j] = f;\r\n" + //
                                "                    }\r\n" + //
                                "                }\r\n" + //
                                "            }\r\n" + //
                                "        }\r\n" + //
                                "        System.out.println(\"No\\tAuthor name\\tBook name\\tBook Price\\tPublisher Name\\t\\tStock\\t\\tTotal\\t\\tNotification\");\r\n" + //
                                "        System.out.println(\r\n" + //
                                "                \"................................................................................................................................\");\r\n" + //
                                "        for (int i = 0; i < book.length; i++) {\r\n" + //
                                "            System.out.print((i + 1) + \"\\t\" + author[i] + \"\\t\\t\" + book[i] + \"\\t\\t\" + price[i] + \"\\t\\t\" + publisher[i]\r\n" + //
                                "                    + \"\\t\\t\" + stock[i] + \"\\t\\t\" + price[i] * stock[i] + \"\\t\\t\" + noti[i] + \"\\n" + //
                                "\");\r\n" + //
                                "            System.out.println(\r\n" + //
                                "                    \"_______________________________________________________________________________________________________________________________\");\r\n" + //
                                "        }\r\n" + //
                                "\r\n" + //
                                "    }\r\n" + //
                                "}\r\n" + //
                                "\r\n" + //
                                "public class pra6 {\r\n" + //
                                "    public static void main(String args[]) {\r\n" + //
                                "\r\n" + //
                                "        Scanner sc = new Scanner(System.in);\r\n" + //
                                "        System.out.println(\"Enter how many books you want to enter?\");\r\n" + //
                                "        int books = sc.nextInt();\r\n" + //
                                "        sc.nextLine();\r\n" + //
                                "\r\n" + //
                                "        System.out.println(\"Enter book details\");\r\n" + //
                                "        Library lib = new Library();\r\n" + //
                                "        lib.ReadData(books);\r\n" + //
                                "\r\n" + //
                                "        System.out.println(\"No\\tAuthor name\\tBook name\\tBook Price\\tPublisher Name\\t\\tStock\\t\\tTotal\\t\\tNotification\");\r\n" + //
                                "        System.out.println(\"................................................................................................................................\");\r\n" + //
                                "        lib.ShowData();\r\n" + //
                                "        System.out.println(\"\");\r\n" + //
                                "        System.out.println(\"\");\r\n" + //
                                "        lib.AccendingData();\r\n" + //
                                "    }\r\n" + //
                                "\r\n" + //
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
