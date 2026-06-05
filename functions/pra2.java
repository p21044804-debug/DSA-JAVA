import java.util.Scanner;

public class pra2 {
    static void sigma(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("sigma =" + sum);

    }

    static void factorial(int n) {

        int multi = 1;
        for (int i = 1; i <= n; i++) {
            multi *= i;
        }
        System.out.println("factorial =" + multi);
    }

    static void piramid(int n, char ch) {

        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(ch + " ");
            }
            System.out.println("");
        }
    }

    static void multi_Table(int a, int b) {

        for (int i = 1; i <= 10; i++) {
            for (int j = a; j <= b; j++) {
                System.out.print(j + " X " + i + "= " + j * i + " ");
            }
            System.out.println("");
        }

    }

    public static boolean isprime(int n) {

        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static boolean perfect_num(int n) {

        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum == n;

    }

    public static boolean isnevine(int n) {

        int result = 0;

        while (n != 0) {
            int rev = n % 10;
            result = result + rev;
            n = n / 10;
        }

        return (n % result == 0);

    }

    public static boolean isArmstrong(int n) {

        int ori_num = n;
        int result = 0;

        while (n != 0) {
            int rev = n % 10;
            result = result + (rev * rev * rev);
            n = n / 10;
        }

        return result == ori_num;

    }

    public static void Isprimerange(int n) {

        int start = 1;

        while (start <= n) {
            // System.out.println(n);
            start++;
            int result = 0, temp = start;
            int ori_num = start;
            while (temp != 0) {
                int rev = temp % 10;
                result = result + (rev * rev * rev);
                temp = temp / 10;
            }
            if (result == ori_num) {
                System.out.println(result);
            }
        }

    }

    public static boolean Ispalindrome(int n) {
        int result = 0;

        while (n != 0) {
            int rev = n % 10;
            result = result * 10 + rev;
            n = n / 10;
        }

        return result == n;
    }

    public static void damru(int n,char a) {
        // upper
        for (int row = n; row >= 1; row--) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(a+" ");
            }
            System.out.println("");
        }
        // lower

        for (int row = 2; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(a+" ");
            }
            System.out.println("");
        }

    }

    public static void diamond(int n,char a){
        //upper
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(a+" ");
            }
            System.out.println("");
        }

        //lower
        for (int row = n-1; row >= 1; row--) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(a+" ");
            }
            System.out.println("");
        }
    }

    public static void patang(int n,char a){
        //upper
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(a+" ");
            }
            System.out.println("");
        }

        //lower
        for (int row = n-1; row >= 1; row--) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(a+" ");
            }
            System.out.println("");
        }

        //tail
         for (int row = 2; row <= n-2; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(a+" ");
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        System.out.println("Enter symbol");
        char a = sc.next().charAt(0);

        // sigma();
        // factorial();
        // piramid();
        // multi_Table();
        // isprime();

        // System.out.println(n + " is armstrong number? :" + isArmstrong(n));
        // piramid(n,a);
        // damru(n, a);
        // diamond(n, a);
        patang(n, a);

        sc.close();
    }
}
