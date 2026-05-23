import java.util.*;
public class pra1{
    static void sigma(){
        Scanner sc = new Scanner(System.in);
        System.out.println("how many values you want to enter?");
        int n = sc.nextInt();
        int sum =0;
        for (int i = 1; i <=n; i++) {
            sum+=i;
        }
        System.out.println("sigma ="+sum);
        
        
    }
    static void factorial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("how many values you want to enter?");
        int n = sc.nextInt();
        int multi =1;
        for (int i = 1; i <=n; i++) {
            multi*=i;
        }
        System.out.println("factorial ="+multi);
    }

    static void piramid(){

        Scanner sc = new Scanner(System.in);
        System.out.println("how many values you want to enter?");
        int n = sc.nextInt();


         for (int row = 1;row<=n;row++){
            for (int space = 1; space <=n-row ; space++) {
                System.out.print(" ");
            }
            for(int col =1;col<=row;col++){
                System.out.print("$ ");
            }
            System.out.println("");
        }
    }

    static void multi_Table(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int n2 = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            for(int j=n1;j<=n2;j++){
                System.out.print(j+" X "+i+"= "+j*i+" ");
            }
            System.out.println("");
        }
    }

     public static void isprime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number:");
        int n=sc.nextInt();
        boolean isprime = true;
        for (int i = 2;i<=n;i++){
            if (n % i == 0) {
                isprime = false;
            }
        }
        
        if(isprime){
            System.out.println("enter number is not prime");
        }
        else{
            System.out.println("number is prime");
        }
        
    }

     public static void perfect_num() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number:");
        int n = sc.nextInt();
        int sum = 0;
       for(int i=1;i<n;i++){
            if (n % i == 0) {
                sum += i;
            }
        }
       
        if (sum == n) {
            System.out.println("Entered number is perfect");
        }
        
    }
    public static void main(String args []){
     
        // sigma();
        // factorial();
        // piramid();
        // multi_Table();
        isprime();
        perfect_num();
    }
}