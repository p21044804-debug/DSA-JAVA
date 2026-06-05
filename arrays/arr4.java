import java.util.*;

public class arr4 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int count_zero = 0, pve = 0, nve = 0, odd = 0, even = 0;

        for (var i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]=");
            arr[i] = sc.nextInt();

        }

        for (var i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count_zero++;
            }
            if (arr[i] > 0) {
                pve++;
            }
            if (arr[i] < 0) {
                nve++;
            }
            if (arr[i] % 2 == 0) {
                even++;
            }
            if (!(arr[i] % 2 == 0)) {
                odd++;
            }

        }
        System.out.println("Zero :"+count_zero);
        System.out.println("positive :"+pve);
        System.out.println("negative :"+nve);
        System.out.println("odd :"+odd);
        System.out.println("even :"+even);
    }
}
