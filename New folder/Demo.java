import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringTokenizer st=new StringTokenizer(str);
        int sum=0;
        while(st.hasMoreTokens()){
            String Token=st.nextToken();
            try{
                int n=Integer.parseInt(Token);
                System.out.println(Token);
                sum+=n;
            }catch(NumberFormatException e){
                System.out.println("Error : Invalid Input"+Token);
            }
        }
        System.out.println(sum);
        
    }
}
