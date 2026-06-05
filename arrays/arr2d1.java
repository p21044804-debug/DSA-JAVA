import java.util.Scanner;

public class arr2d1{
    public static void main(String[] args) {
         int arr[][] = new int[3][3];
         int sum=0;
         
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr.length;j++){
                System.out.print("Enter values in arr:["+i+"] ["+j+"]");
                arr[i][j]=sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr.length;j++){
                sum+=arr[i][j];
                
            }
        }
        System.out.print(sum+" ");
    }
}