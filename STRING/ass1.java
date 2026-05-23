import java.util.*;;
public class ass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String:");
        String str = sc.nextLine();
        String arr[] = new String[str.length()];

        String []result = str.split(" ");
        int length = str.length();
        StringBuilder str1 = new StringBuilder();
        for(String word : result ){
            StringBuilder res = new StringBuilder(word).reverse();
            res.toString();
            System.out.print(res+" ");
           
        }
        
    }
}
