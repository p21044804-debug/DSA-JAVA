
import java.util.*;

public class LinearSearch{

    public static int ret_index(int target,int [] arr ){
        int index=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == target){
                index=i;
            }
        }
        return index;
    }
    public static boolean linear_search(int target,int [] arr){
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                flag=true;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(linear_search(target, arr)){
            System.out.println("Value founded at index :"+ret_index(target, arr));
        }
    }
}