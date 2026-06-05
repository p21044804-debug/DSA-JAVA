public class Prac1 {

    public static void main(String[] args) {
        int [] arr={1,2,2,4,5,8};
        int count=0;
        int x=7;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<x){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
