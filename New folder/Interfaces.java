import java.util.*;
interface shape{
    double calArea();
    double calPerimeter();
}
interface color{
    String getcolor();
}
class Circle implements shape,color{
    private double radius;
    private String color;
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    public double calArea(){
        return Math.PI*radius*radius;
    }
    public double calPerimeter(){
        return 2*Math.PI*radius;
    }
    public String getcolor(){
        return color;
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int r =sc.nextInt();
        System.out.println("Enter color");
        String c=sc.next();
        Circle cr=new Circle(r, c);
        System.out.printf("Area : %.2f\nPerimeter : %.2f\nColor : %s\n",cr.calArea(),cr.calPerimeter(),cr.getcolor());
    }
}
