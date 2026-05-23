public class Dsa {
    public static int arraySign(int[] nums) {
        int product=1;
        for(int i=0;i<nums.length;i++){
            product*=nums[i];
        }
        if(product==0) return 0;
        else if(product<0) return -1;
        return 1;
    }
    public static void main(String[] args) {
        int nums[]={-1,-2,-3,-4,3,2,1};
        arraySign(nums);
    }
}