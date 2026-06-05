import java.util.Scanner;

public class arr8 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        int arr[] =new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.println("arr[" + i + "]=");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                sec_max=max;
                max=arr[i];
            }
            else if(arr[i]>sec_max && sec_max != max){
                sec_max=max;
            }
        }
        System.out.println(sec_max);
    }
}
