import java.util.*;
import java.io.*;

public class pra9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Which file you want to create :\n1.for c language file\n2.for c++ language file\n3.for Java language file\n4.for Python language file");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter the name of the file");
                String name = sc.next();
                File fc = new File("C:\\Users\\admin\\OneDrive\\Desktop\\depple\\java\\file handling\\" + name + ".c");
                try {
                    if (fc.createNewFile()) {
                        System.out.println("File created");
                    } else {
                        System.out.println("File already exists");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
                try {
                    FileWriter fw = new FileWriter(
                            "C:\\Users\\admin\\OneDrive\\Desktop\\depple\\java\\file handling\\" + name + ".c");
                    fw.write("#include <stdio.h>\r\n" + //
                            "\r\n" + //
                            "int main() {\r\n" + //
                            "  \r\n" + //
                            "    \r\n" + //
                            "\r\n" + //
                            "    return 0;\r\n" + //
                            "}");
                    fw.close();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                    e.printStackTrace();
                }
                break;
            case 2:
            System.out.println("Enter the name of the file");
            String name1 = sc.next();
            File fcpp = new File("C:\\Users\\admin\\OneDrive\\Desktop\\depple\\java\\file handling\\" + name1 + ".c++");
                try {
                    if (fcpp.createNewFile()) {
                        System.out.println("FILE CREATED SUCCESSFULLY");
                    }else{
                        System.out.println("FILE NOT CREATED ");
                    }
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                    e.printStackTrace();
                }
                try{
                FileWriter fw1 = new FileWriter("C:\\Users\\admin\\OneDrive\\Desktop\\depple\\java\\file handling\\" + name1 + ".c++");
                fw1.write("#include <iostream>\r\n" + //
                                        "using namespace std;\r\n" + //
                                        "int main() {\r\n" + //
                                        "    \r\n" + //
                                        "  \r\n" + //
                                        "    return 0;\r\n" + //
                                        "}");
                 fw1.close();
                } 
                
                catch(Exception e){
                 System.err.println(e.getMessage());
                 e.printStackTrace();
                }
                break;
                case 3:
            System.out.println("Enter the name of the file");
            String name2 = sc.next();
            File fj = new File("C:\\Users\\admin\\OneDrive\\Desktop\\depple\\java\\file handling\\" + name2 + ".java");
                try {
                    if (fj.createNewFile()) {
                        System.out.println("FILE CREATED SUCCESSFULLY");
                    }else{
                        System.out.println("FILE NOT CREATED ");
                    }
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                    e.printStackTrace();
                }
                try{
                FileWriter fw1 = new FileWriter("C:\\Users\\admin\\OneDrive\\Desktop\\depple\\java\\file handling\\" + name2 + ".java");
                fw1.write("import java.util.*;\r\n" + //
                                        "public class "+name2+"{\r\n" + //
                                        "public static void main(String[] args) {\r\n" + //
                                        "    \r\n" + //
                                        "  \r\n" + //
                                        "    }\r\n" + //
                                        "}");
                 fw1.close();
                } 
                
                catch(Exception e){
                 System.err.println(e.getMessage());
                 e.printStackTrace();
                }
                break;

                case 4:
            System.out.println("Enter the name of the file");
            String name3 = sc.next();
            File fp = new File("C:\\Users\\admin\\OneDrive\\Desktop\\depple\\java\\file handling\\" + name3 + ".py");
                try {
                    if (fp.createNewFile()) {
                        System.out.println("FILE CREATED SUCCESSFULLY");
                    }else{
                        System.out.println("FILE NOT CREATED ");
                    }
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                    e.printStackTrace();
                }
                try{
                FileWriter fw1 = new FileWriter("C:\\Users\\admin\\OneDrive\\Desktop\\depple\\java\\file handling\\" + name3 + ".py");
                fw1.write("//start your code from here");
                 fw1.close();
                } 
                
                catch(Exception e){
                 System.err.println(e.getMessage());
                 e.printStackTrace();
                }
                break;
                default:
                System.out.println("Enter a valid input");

        }
        sc.close();
    }
}
