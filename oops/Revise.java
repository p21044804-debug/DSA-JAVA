import java.util.Scanner;

public class Revise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of Array");
        int size=sc.nextInt();
        int[] nums=new int[size];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++) {
            System.out.printf("Please enter Array[%d] : \n",i);
            nums[i]=sc.nextInt();
        }

        for (int i=1;i<nums.length;i++) {
            if(nums[0]>nums[i]){
                
            }
        }

//        for (int num : nums) {
//            if(max<num) {
//                max=num;
//            }
//            if(min>num){
//                min=num;
//            }
//
//        }
        System.out.println("Max  : "+max+" Min  : "+min);

    }
}
