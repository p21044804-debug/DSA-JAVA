import java.util.Scanner;

public class arr2d2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr.length;j++){
                System.out.print("Enter values in arr:["+i+"] ["+j+"]");
                arr[i][j]=sc.nextInt();
            }
        }

        for (var i = 0; i < arr.length; i++) {
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
                
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("Maximum value in arr is:"+max);
        System.out.println("Manimum value in arr is:"+min);
        sc.close();
    }
}
