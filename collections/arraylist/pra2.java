import java.util.*;
public class pra2 {
 public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    // list.remove(1);//it will remove the first occurrence of 1
    System.out.println(list);
    list.remove(Integer.valueOf(1));//
    System.out.println(list);
    
    
 }
}