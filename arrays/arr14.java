import java.util.Scanner;

public class arr14 {
    public static void main(String[] args) {
         int arr[] = new int[5];
         
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]=");
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=key){
                System.out.print(arr[i]+" ");
            }

        }

    }
    
}
