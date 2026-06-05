import java.util.*;

public class arr3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (var i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]=");
            arr[i] = sc.nextInt();

        }
        int max = arr[0];
        int min = arr[0];

        for (var i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }

            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum value in arr is:"+max);
        System.out.println("Manimum value in arr is:"+min);
        sc.close();

    }
}
