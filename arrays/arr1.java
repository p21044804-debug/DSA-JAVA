import java.util.*;

public class arr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (var i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]=");
            arr[i] = sc.nextInt();

        }

        for (var i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }
}