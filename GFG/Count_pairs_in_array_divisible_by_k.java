package GFG;

public class Count_pairs_in_array_divisible_by_k {
     public int countKdivPairs(int[] arr, int k) {
        // code here
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j])%k == 0){
                    count++;
                }
            }
        }
           
        return count;
    }
    public static void main(String[] args) {
        
    }
}
