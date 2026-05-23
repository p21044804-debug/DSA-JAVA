public class pra52{
  
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=5;i++){
            for(int j =i;j>=1;j--){
                sum=j%2;
                System.out.print(sum+" ");    
                
            }
            
            System.out.println("");
        }
    }
}
