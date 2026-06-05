public class RotateByK{
    static void reverse_arr(int arr[],int start,int end) {
        // code here
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        
    }
    public static void main(String [] args) {
        
        // code here
        int [] arr={1,2,3,4,5};
        int d=2;
        d=d%arr.length;
        
        reverse_arr(arr, 0, d-1);
        reverse_arr(arr, d, arr.length-1);
        reverse_arr(arr, 0, arr.length-1);
        
    }
          
}
/*
brute force approach
public static void main(String [] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int d = 2;
        int n = arr.length;

        d = d % n; 
        

        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }
*/