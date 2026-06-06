package GFG;

public class Max_subarray_sum {

     public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        long maxsum=sum;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i]-arr[i-k];
            maxsum=Math.max(maxsum,sum);
        }
        return (int)(maxsum);
    }
    public static void main(String[] args) {
        
    }
}
