
import java.util.*;
 class TeamMember{
      Scanner sc=new Scanner(System.in);
    String project;
    String language;
    void performTask(){
        System.out.println("Performing a task as a task member");
    }
}
    class Devloper extends TeamMember{
        @Override
        void performTask(){
            System.out.println("Enter Programming language :");
            language =sc.next();
        System.out.println("I am devloper coding in "+language);
    }
    }
    class ProductOwner extends TeamMember{
         @Override
        void performTask(){
            System.out.println("Enter Project  :");
            project =sc.next();
        System.out.println("I am managing project : "+project);
    }
    }
    

public class MethodOverride{
    public static void main(String[] args) {
      Devloper d=new Devloper();
      ProductOwner p=new ProductOwner();
      d.performTask();
      p.performTask();
        
    }
}
