import java.io.File; //importing file class 
import java.io.FileWriter;
import java.io.IOException; //importing the ioExxception class for handling errors
import java.util.Scanner;

import java.io.FileNotFoundException;

public class pra1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        File fo = new File("C:\\Users\\admin\\OneDrive\\Desktop\\depple\\java\\file handling\\biodata.txt");
        try {
            if (fo.createNewFile()) {
                System.out.println("File" + fo.getName() + "is created successfully");

            } else {
                System.out.println("File is already exist in directory.");
            }

        } catch (IOException exception) {
            System.out.println("An unexpected error is occurred");
            exception.printStackTrace();
        }

        // geting file information

        if (fo.exists()) {
            // geting file name
            System.out.println("File name is :" + fo.getName());

            // geting file absulate path
            System.out.println("File Absulate path is :" + fo.getAbsolutePath());

            // checking the file is Writeable or not
            System.out.println("Is file Writeable? :" + fo.canWrite());

            // checking the file is readable or not
            System.out.println("is file Readable? :" + fo.canRead());

            // getting the length of the file in bytes
            System.out.println("The size of the file in bytes is :" + fo.length());
        }

        // writting into file

        try {
            FileWriter fwrite = new FileWriter(
                    "C:\\Users\\admin\\OneDrive\\Desktop\\depple\\java\\file handling\\biodata.txt");

            // writing the content into current file

            fwrite.write(
                    "\nI Pavan Patel.\nCurrently, I am pursuing my B.tech CSE from Parul University in 3rd sem.\nmy hobies are:Reading,Coding,Exploring New Things.\nSelf Quate:\"Life is full of chaos; be peaceful and follow the road to success.");

            fwrite.close();
            System.out.println("Content is Successfully Wrote to the file.");
        } catch (Exception exception) {
            System.out.println("Unexpected error occured");
            exception.printStackTrace();
        }

        // read from file

        try {
            // File fo = new File("C:\\Users\\admin\\OneDrive\\Desktop\\depple\\java\\file
            // handling\\FileOperationExample.txt");
            Scanner sc = new Scanner(fo);
            while (sc.hasNextLine()) {
                String fileData = sc.nextLine();
                System.out.println(fileData);

            }
            sc.close();
        } catch (FileNotFoundException exception) {
            System.out.println("Unexpected Error occurred!");
            exception.printStackTrace();
            
        }

        System.out.println("If you want to delete currently open file Enter 1.delete 2.do no delete");
        int input = inp.nextInt();
        if (input == 1) {
            boolean deleted = fo.delete();
            if (deleted) {
                System.out.println("File is deleted successfully");
            } else {
                System.out.println("File is not deleted");
            }
        }

        try {
            if (fo.exists()) {
                System.out.println("file is existing ");
            } else {
                System.out.println("File is not existing");
            }
        } catch (Exception exception) {
            System.out.println("Unexpected error found");
            exception.printStackTrace();
        }
        inp.close();
    }
}