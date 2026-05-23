import java.util.*;
   abstract class Vehicle{
        String model;
        abstract void startEngine();
   }
   class Car extends Vehicle{
        public Car(String model){
            this.model=model;
        }
        void startEngine(){
            System.out.println("Motercycle Model : "+model);
            System.out.println("Motercycle Engine started....");
        }
   }
   class Motercycle extends Vehicle{
        public Motercycle(String model){
            this.model=model;
        }
        void startEngine(){
            System.out.println("Motercycle Model : "+model);
            System.out.println("Motercycle Engine started....");
        }
   }
public class T1 {

    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter car model: ");
      String cm=sc.next();
      Vehicle car=new Car(cm);
      car.startEngine();
      System.out.println("Enter Motercycle model: ");
      String mm=sc.next();
      Vehicle Motercycle=new Motercycle(mm);
      Motercycle.startEngine();

    }
}



