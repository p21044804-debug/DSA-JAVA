public class Staircase{
   
    static int add(int a,int b){
        return a+b;
    }
    public static void main(String [] args){
        int n=5;
        for(int i=1;i<=n;i++){
            int k;
            if(i%2!=0) k=i+1;
            else k=i;
            for(int j=0;j<k;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}