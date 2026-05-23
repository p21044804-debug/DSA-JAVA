import java.util.Scanner;

public class arr5 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);

        for (var i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]=");
            arr[i] = sc.nextInt();

        }

        for (var i = 0; i < arr.length; i=i+2) {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
           


        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
        
    }
}
