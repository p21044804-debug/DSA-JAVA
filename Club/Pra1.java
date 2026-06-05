public class Pra1{
    public static void main(String[] args) {
        int i=54;
        int res =0;

        // while(true){
        //     int temp=(int) Math.pow(2, res);
        //     if(temp==i){
        //         System.out.println("It is power of 2");
        //         break;
        //     }
        //     if(temp>i){
        //         System.out.println("It is not a power of 2");
        //         break;
        //     }
        //     res++;
        // }

        // int a+b 0101 0110 0111(7)   0100(4)
        
        int a=5,b=6;
        while(b!=0){
            int temp=(int)(a&b);
            a=a^b;
            b=temp<<1;
        }
        System.out.println(a);

    }

}