package Oops;
import java.lang.*;
public class Encapsulation {
    public static void main(String[] args){
        Student s1=new Student();
        //System.out.println(s1.name);

    }
}

class Student{
    String name;
    int rollNo;

    Student(){
       System.out.println("constructor is called");
    }
}
