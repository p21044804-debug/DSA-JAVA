import java.util.*;
import java.io.*;

public class Test {

    static final int a = 10;

    public static void main(String args[]) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Pavan", 100);
        marks.put("Pranay", 85);
        marks.put("Kalpit", 95);

        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("-----------------");
        }
        // System.out.println(marks.get("Janak")>20);
        Optional<Integer> marksOfJanak = Optional.ofNullable(marks.get("Janak"));
        if (marksOfJanak.isPresent()) {
            //
        } else {
            System.err.println("Error");
        }
    }
}
/*
 * List<Integer> arr=new ArrayList<>();
 * arr.add(1);
 * arr.add(1);
 * arr.add(1);
 * arr.add(2);
 * arr.add(3);
 * arr.add(4);
 * arr.add(60);
 * 
 * for(int i=0;i<arr.size();i++){ //for loop
 * System.out.println(arr.get(i));
 * }
 * for(int num:arr){ //for each loop
 * System.out.println(num);
 * }
 * 
 */