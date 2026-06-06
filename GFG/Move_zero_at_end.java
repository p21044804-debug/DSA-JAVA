package GFG;

public class Move_zero_at_end {

    void pushZerosToEnd(int[] arr) {
        // code here
        int end=0;
        for(int start=0;start<arr.length;start++){
            if(arr[start]!=0){
                arr[end]=arr[start];
                end++;
            }
        }
        while(end<arr.length){
            arr[end]=0;
            end++;
        }
    }
    public static void main(String[] args) {
        
    }
}
