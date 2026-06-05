import java.util.Scanner;

public class arr13 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[5];
        int p=0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]=");
            a[i] = sc.nextInt();

        }

        int k = 0;
        for(int i=0;i<a.length;i++){
            int temp = 0;
            for(int j=0;j<k;j++){
               if(a[i]==b[j]){
                    temp=1;
                    break;
               } 
            }
            if (temp == 0) {
                b[k]=a[i];
                k++;
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.println(b[i]);
        }

    }
}
