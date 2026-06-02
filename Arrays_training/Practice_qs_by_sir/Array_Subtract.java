public class Array_Subtract {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        int [] arr2={1,2,3};
        int max=Math.max(arr1.length,arr2.length);
        // int [] result=new int[max];
        // int i=arr1.length;
        // int j=arr2.length;
        // while(i>=0 && j>=0){

        // }
        int borrow=0;
        for(int i=arr1.length-1;i>=0;i--){
            arr1[i]=arr1[i]-arr2[i]-borrow;
            if(arr1[i]<0){
                arr1[i]=arr1[i]+10;
                borrow=1;
            }else{
                borrow=0;
            }
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
    
}
