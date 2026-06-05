import java.util.*;
import java.io.*;

public class pra8 {
    public static void main(String[] args) {
        File fp = new File("C:\\Users\\admin\\OneDrive\\Desktop\\depple\\java\\file handling\\rent.txt");
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
            FileWriter fw = new FileWriter("C:\\Users\\admin\\OneDrive\\Desktop\\depple\\java\\file handling\\rent.txt");
            fw.write("import java.util.Scanner;\r\n" + //
                                "\r\n" + //
                                "class Hotel {\r\n" + //
                                "    Scanner sc = new Scanner(System.in);\r\n" + //
                                "    int arr[];\r\n" + //
                                "    String[] Name;\r\n" + //
                                "    int[] Mo;\r\n" + //
                                "    String[] bike;\r\n" + //
                                "    int[] rent;\r\n" + //
                                "\r\n" + //
                                "    int[] day;\r\n" + //
                                "\r\n" + //
                                "    void ReadData(int cus) {\r\n" + //
                                "        Name = new String[cus];\r\n" + //
                                "        Mo = new int[cus];\r\n" + //
                                "        bike = new String[cus];\r\n" + //
                                "        rent = new int[cus];\r\n" + //
                                "        day = new int[cus];\r\n" + //
                                "\r\n" + //
                                "        for (int i = 0; i < cus; i++) {\r\n" + //
                                "            System.out.println(\"Enter customer name:\");\r\n" + //
                                "            sc.nextLine();\r\n" + //
                                "            Name[i] = sc.nextLine();\r\n" + //
                                "\r\n" + //
                                "            System.out.println(\"Enter mobile number:\");//\r\n" + //
                                "            Mo[i] = sc.nextInt();\r\n" + //
                                "\r\n" + //
                                "            System.out.println(\"Enter bike name:\");\r\n" + //
                                "            sc.nextLine();\r\n" + //
                                "            bike[i] = sc.nextLine();\r\n" + //
                                "\r\n" + //
                                "            System.out.println(\"Enter Rent :\");//\r\n" + //
                                "            rent[i] = sc.nextInt();\r\n" + //
                                "\r\n" + //
                                "            System.out.println(\"Enter Days:\");\r\n" + //
                                "            day[i] = sc.nextInt();\r\n" + //
                                "        }\r\n" + //
                                "\r\n" + //
                                "    }\r\n" + //
                                "\r\n" + //
                                "    void ShowData() {\r\n" + //
                                "\r\n" + //
                                "        for (int i = 0; i < rent.length; i++) {\r\n" + //
                                "            System.out.print((i + 1) + \"\\t\" + Name[i] + \"\\t\\t\" + Mo[i] + \"\\t\\t\" + bike[i] + \"\\t\\t\" + rent[i] + \"\\t\\t\"\r\n" + //
                                "                    + day[i] + \"\\t\\t\" + rent[i] * day[i] + \"\\t\\t\\n" + //
                                "\");\r\n" + //
                                "            System.out.println(\r\n" + //
                                "                    \"_______________________________________________________________________________________________________________________________\");\r\n" + //
                                "        }\r\n" + //
                                "        int tot_days = 0;\r\n" + //
                                "        int tot_amount = 0;\r\n" + //
                                "\r\n" + //
                                "        for (int i = 0; i < day.length; i++) {\r\n" + //
                                "            tot_days += day[i];\r\n" + //
                                "            tot_amount += rent[i] * day[i];\r\n" + //
                                "\r\n" + //
                                "        }\r\n" + //
                                "        System.out.println(\"Total days\" + tot_days);\r\n" + //
                                "        System.out.println(\"Total Amount\" + tot_amount);\r\n" + //
                                "    }\r\n" + //
                                "\r\n" + //
                                "    void AccendingData() {\r\n" + //
                                "        System.out.println(\"Are you want to print data in ascending order by rent or days? \\n" + //
                                "1. for day \\n" + //
                                "2. for rent\");\r\n" + //
                                "        int a = sc.nextInt();\r\n" + //
                                "\r\n" + //
                                "        if (a == 1) {\r\n" + //
                                "            for (int i = 0; i < arr.length; i++) {\r\n" + //
                                "                for (int j = 0; j < arr.length - i - 1; j++) {\r\n" + //
                                "                    if (day[j] > day[j + 1]) {\r\n" + //
                                "                        String b = Name[j + 1];\r\n" + //
                                "                        Name[j + 1] = Name[j];\r\n" + //
                                "                        Name[j] = b;\r\n" + //
                                "\r\n" + //
                                "                        String c = bike[j + 1];\r\n" + //
                                "                        bike[j + 1] = bike[j];\r\n" + //
                                "                        bike[j] = c;\r\n" + //
                                "\r\n" + //
                                "                        int temp = Mo[j + 1];\r\n" + //
                                "                        Mo[j + 1] = Mo[j];\r\n" + //
                                "                        Mo[j] = temp;\r\n" + //
                                "\r\n" + //
                                "                        int e = rent[j + 1];\r\n" + //
                                "                        rent[j + 1] = rent[j];\r\n" + //
                                "                        rent[j] = e;\r\n" + //
                                "\r\n" + //
                                "                        int f = day[j + 1];\r\n" + //
                                "                        day[j + 1] = day[j];\r\n" + //
                                "                        day[j] = f;\r\n" + //
                                "                    }\r\n" + //
                                "                }\r\n" + //
                                "            }\r\n" + //
                                "        }\r\n" + //
                                "\r\n" + //
                                "        if (a == 2) {\r\n" + //
                                "            for (int i = 0; i < arr.length; i++) {\r\n" + //
                                "                for (int j = 0; j < arr.length - i - 1; j++) {\r\n" + //
                                "                    if (rent[j] > rent[j + 1]) {\r\n" + //
                                "                        String b = Name[j + 1];\r\n" + //
                                "                        Name[j + 1] = Name[j];\r\n" + //
                                "                        Name[j] = b;\r\n" + //
                                "\r\n" + //
                                "                        String c = bike[j + 1];\r\n" + //
                                "                        bike[j + 1] = bike[j];\r\n" + //
                                "                        bike[j] = c;\r\n" + //
                                "\r\n" + //
                                "                        int temp = Mo[j + 1];\r\n" + //
                                "                        Mo[j + 1] = Mo[j];\r\n" + //
                                "                        Mo[j] = temp;\r\n" + //
                                "\r\n" + //
                                "                        int e = rent[j + 1];\r\n" + //
                                "                        rent[j + 1] = rent[j];\r\n" + //
                                "                        rent[j] = e;\r\n" + //
                                "\r\n" + //
                                "                        int f = day[j + 1];\r\n" + //
                                "                        day[j + 1] = day[j];\r\n" + //
                                "                        day[j] = f;\r\n" + //
                                "                    }\r\n" + //
                                "                }\r\n" + //
                                "            }\r\n" + //
                                "        }\r\n" + //
                                "\r\n" + //
                                "        System.out.println(\"No\\tName\\tMobile\\tBike\\tRent\\t\\tDay\\t\\tTotal\");\r\n" + //
                                "        System.out.println(\r\n" + //
                                "                \"................................................................................................................................\");\r\n" + //
                                "        for (int i = 0; i < arr.length; i++) {\r\n" + //
                                "            System.out.print((i + 1) + \"\\t\" + Name[i] + \"\\t\\t\" + Mo[i] + \"\\t\\t\" + bike[i] + \"\\t\\t\" + rent[i] + \"\\t\\t\"\r\n" + //
                                "                    + day[i] + \"\\t\\t\" + rent[i] * day[i] + \"\\t\\t\\n" + //
                                "\");\r\n" + //
                                "            System.out.println(\r\n" + //
                                "                    \"_______________________________________________________________________________________________________________________________\");\r\n" + //
                                "        }\r\n" + //
                                "\r\n" + //
                                "    }\r\n" + //
                                "}\r\n" + //
                                "\r\n" + //
                                "public class pra7 {\r\n" + //
                                "    public static void main(String args[]) {\r\n" + //
                                "\r\n" + //
                                "        Scanner sc = new Scanner(System.in);\r\n" + //
                                "        System.out.println(\"Enter how many customers you want to add?\");\r\n" + //
                                "        int cus = sc.nextInt();\r\n" + //
                                "\r\n" + //
                                "        Hotel hotel = new Hotel();\r\n" + //
                                "        hotel.ShowData();\r\n" + //
                                "\r\n" + //
                                "        System.out.println(\"No\\tName\\tMobile\\tBike\\tRent\\t\\tDay\\t\\tTotal\");\r\n" + //
                                "        System.out.println(\r\n" + //
                                "                \"................................................................................................................................\");\r\n" + //
                                "\r\n" + //
                                "        hotel.ReadData(cus);\r\n" + //
                                "        System.out.println(\"\");\r\n" + //
                                "        System.out.println(\"\");\r\n" + //
                                "        hotel.AccendingData();\r\n" + //
                                "\r\n" + //
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
