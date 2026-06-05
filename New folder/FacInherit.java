import java.util.*;
class Numberin{
    Scanner sc=new Scanner(System.in);
    public int num;
    void inputNum(){
        num=sc.nextInt();
    }
}
class FactorialOut extends Numberin{
    void displayFactorial(){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}
public class FacInherit {
    public static void main(String[] args) {
        FactorialOut f=new FactorialOut();
        f.inputNum();
        f.displayFactorial();
    }
}
