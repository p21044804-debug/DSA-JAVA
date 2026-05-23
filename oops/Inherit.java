//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Mammals extends Animal{
    void walk(){
        System.out.println("Walks");
    }

}

class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}
//derived class
class Fish extends Animal{
    void swim(){
        System.out.println("Swims in water");
    }
}

public class Inherit extends Animal{
    public static void main(String[] args) {
       
    }
}