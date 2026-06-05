//nevine
public class pra32 {
    // nevine number1

    public static void main(String[] args) {

        int n = 1;

        while (n <= 1000) {
            // System.out.println(n);
            n++;
            int result = 0;
            int temp = n;
            while (temp != 0) {
                int rev = temp % 10;
                result = result + rev;
                temp = temp / 10;
            }

            if ( n% result == 0) {
                System.out.println(result);

            }

        }
    }
}
