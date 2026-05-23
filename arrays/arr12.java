import java.util.Scanner;

public class arr12 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for (var i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]=");
            arr[i] = sc.nextInt();

        }
        System.out.println("enter new value:");
        int new_val = sc.nextInt();
        System.out.println("Enter a position of new value");
        int new_pos = sc.nextInt();
        arr[new_pos]=new_val;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }


    }

}
