import java.util.*;

public class Test0 {

    public static int fibb(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else
        return fibb(n-1)+fibb(n-2);
    }
    public static int fibbNonRec(int n){
        int first=0,second=1,temp=0;
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
        for(int i=2;i<=n;i++){
            temp=first+second;
            first=second;
            second=temp;
        }
    }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(fibb(n));
        System.out.println(fibbNonRec(n));
    }  
}
