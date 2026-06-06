package GFG;
// directly from gfg
public class Rotate_Array_by_k {
     public static void reverse_arr(int arr[],int start,int end) {
        // code here
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        
    }
    static void rotateArr(int arr[], int d) {
        // code here
        d=d%arr.length;
        
        reverse_arr(arr, 0, d-1);
        reverse_arr(arr, d, arr.length-1);
        reverse_arr(arr, 0, arr.length-1);
        
        
    }
    public static void main(String [] args){
            
    }
}
