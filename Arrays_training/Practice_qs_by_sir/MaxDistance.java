public class MaxDistance {
    public static void main(String[] args) {
    int [] arr={-1,-2,2,0,0};
    int final_distance=0;
    for(int i=0;i<arr.length;i++){
    int search=arr[i];
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]==search){
            final_distance=Math.max(j-i,final_distance);
            }
        }
    }
    System.out.println(final_distance);
    }
}
