import java.util.*;

public class arr2 {
    public static void main(String[] args) {
        int sum =0;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (var i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]=");
            arr[i] = sc.nextInt();
            sum+=arr[i];

        }

        for (var i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
        System.out.println("sum of "+sum);

    }
}
