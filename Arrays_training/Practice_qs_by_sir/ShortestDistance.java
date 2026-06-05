public class ShortestDistance{
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8};
        int res=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int firsteven=-1;
            int seceven=-1;
            if(arr[i]%2==0){
                firsteven=i;
            }
            for(int j=i+1; j<arr.length;j++){
                if(arr[j]%2 ==0 && firsteven != -1){
                    seceven++;
                    res=(seceven>(j-firsteven)?seceven:firsteven);
                }
            }
        }
        System.out.println(res);
    }
}










// You have been given an array arr that might contain duplicate elements. Your task is to find the maximum possible distance between occurrences of two repeating elements i.e. elements having the same value. If there are no duplicate elements in the array, print 
/*
    int [] arr={3,2,1,2,1,4,5,8,6,7,4,2};
    int final_distance=0;
    for(int i=0;i<arr.length;i++){
    int search=arr[i];
        for(int j=j+1;j<arr.length;j++){
            if(arr[i]==search){
            final_distance=Math.max(j-i,final_distance);
            }
        }
    }
*/