import java.util.Scanner;

public class pra9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Currency value:");
        int  n1 = sc.nextInt();
        System.out.println(
                "Please select a valid option form below:\n 1. Dollor to Rupee\n 2. Rupee to dollor\n 3. Kg to Pound\n 4. pound to kg\n 5. Meter to Centimeter\n 6. Cm to Mm\n 7. Ferenhit to celcius\n 8. celcius to ferenhit\n 9. Km to meter:");
        int opt = sc.nextInt();

        if (opt == 1) {
            System.out.println("Rupee: " + (n1 * 85));
        } else if (opt == 2) {
            System.out.println("Dollor: " + (n1/85));
        } else if (opt == 3) {
            System.out.println("Pound: " + (n1*2.205 ));
        } else if (opt == 4) {
            System.out.println("kg: " + (n1/2.205));
        } else if (opt == 5) {
            System.out.println("Centimeter " + (n1*100));
        } else if (opt == 6) {
            System.out.println("Milimeter " + (n1*100 ));
        } else if (opt == 7) {
            System.out.println("feranhit " + (n1*(9/5)) + 32);
            
        } 
        else if (opt == 8) {
            System.out.println("Centimeter " + (n1-32)*(5/9));
            
        }else {
            System.out.println("You had enterd invalid option");
        }

        sc.close();

    }
}
