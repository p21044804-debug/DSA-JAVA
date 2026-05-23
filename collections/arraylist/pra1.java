import java.util.ArrayList;
import java.util.Collection;
public class pra1{
    public static void main(String[] args) {
        ArrayList<String>fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("WaterMelon");
        System.out.println(fruits);
        fruits.remove(1);
        System.out.println(fruits);
        Collection<String>numbers=new ArrayList<>();
        numbers.add("12");
        numbers.add("01");
        numbers.add("12");
        numbers.add("02");
       

        fruits.addAll(numbers);
        System.out.println(fruits);
        fruits.add(0,"Mellon");
        System.out.println(fruits);
        fruits.addAll(3,numbers);
        if(fruits.contains("01")){
            System.out.println("yeah it contains");
        }else{
            System.out.println("not contaning");
        }
       
        System.out.println(fruits.subList(0, 5));

    }
}