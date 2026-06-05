import java.util.Scanner;

public class arr2d3 {
        public static void main(String[] args) {
            int arr[][] = new int[3][3];
            
           Scanner sc = new Scanner(System.in);
        int count_zero = 0, pve = 0, nve = 0, odd = 0, even = 0;

        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr.length;j++){
                System.out.print("Enter values in arr:["+i+"] ["+j+"]");
                arr[i][j]=sc.nextInt();
            }
        }

        for (var i = 0; i < arr.length; i++) {
            for(int j=0;j<arr.length;j++){
                if (arr[i][j] == 0) {
                    count_zero++;
                }
                if (arr[i][j] > 0) {
                    pve++;
                }
                if (arr[i][j] < 0) {
                    nve++;
                }
                if (arr[i][j] % 2 == 0) {
                    even++;
                }
                if (!(arr[i][j] % 2 == 0)) {
                    odd++;
                }
            }
            

        }
        System.out.println("Zero :"+count_zero);
        System.out.println("positive :"+pve);
        System.out.println("negative :"+nve);
        System.out.println("odd :"+odd);
        System.out.println("even :"+even);
    }
}
