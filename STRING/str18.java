import java.util.*;

public class str18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        int wc = 1;
        String result = "";
        int start = 0,end =str.length()-1;

        while (start<=end &&str.charAt(start)==' ') {
            start++;
        }
         while (start>=end &&str.charAt(end)==' ') {
            end--;
        }
        for (int k =start; k<=end; k++) {
            System.out.print(str.charAt(k));
        }

       

        System.out.println(result);

    }

}
