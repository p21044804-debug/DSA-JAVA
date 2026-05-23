import java.util.*;
public class arr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] =new int[10];
        for(int i=0;i<arr.length;i++){
            System.out.println("arr[" + i + "]=");
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
