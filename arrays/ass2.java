import java.util.Scanner;

public class ass2 {
     public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many customers you want to add?");
        int cus = sc.nextInt();

        int arr[] = new int[cus];
        String[] Name = new String[cus];//name
        int [] Mo = new int[cus];//mobile
        String[] bike = new String[cus];//bike
        int[] rent = new int[cus];
        
        int[] day = new int[cus];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter customer name:");
            sc.nextLine();
            Name[i] = sc.nextLine();
           

            System.out.println("Enter mobile number:");//
            Mo[i] = sc.nextInt();


            System.out.println("Enter bike name:");
            sc.nextLine();
            bike[i] = sc.nextLine();
           

            System.out.println("Enter Rent :");//
            rent[i] = sc.nextInt();

            System.out.println("Enter Days:");
            day[i] = sc.nextInt();
        }

        System.out.println("No\tName\tMobile\tBike\tRent\t\tDay\t\tTotal");
        System.out.println("................................................................................................................................");
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i+1)+"\t"+ Name[i] +"\t\t"+ Mo[i]+"\t\t"+bike[i] +"\t\t"+rent[i] +"\t\t"+day[i]+"\t\t"+rent[i]*day[i]+"\t\t\n");
            System.out.println("_______________________________________________________________________________________________________________________________");
        }
        int tot_days=0;
        int tot_amount=0;

        for (int i = 0; i < day.length; i++) {
            tot_days+=day[i];
            tot_amount+=rent[i]*day[i];

        }
        System.out.println("Total days"+tot_days);
        System.out.println("Total Amount"+tot_amount);

        System.out.println("Are you want to print data in ascending order by rent or days? \n1. for day \n2. for rent");
        int a = sc.nextInt();

        if (a == 1){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (day[j] > day[j + 1]) {
                        String b = Name[j + 1];
                        Name[j + 1] = Name[j];
                        Name[j] = b;

                        String c = bike[j + 1];
                        bike[j + 1] = bike[j];
                        bike[j] = c;

                        int temp = Mo[j + 1];
                        Mo[j + 1] = Mo[j];
                        Mo[j] = temp;


                        int e = rent[j + 1];
                        rent[j + 1] = rent[j];
                        rent[j] = e;

                        int f = day[j + 1];
                        day[j + 1] = day[j];
                        day[j] = f;
                    }
                }
            }
        }

        if (a == 2){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (rent[j] > rent[j + 1]) {
                        String b = Name[j + 1];
                        Name[j + 1] = Name[j];
                        Name[j] = b;

                        String c = bike[j + 1];
                        bike[j + 1] = bike[j];
                        bike[j] = c;

                        int temp = Mo[j + 1];
                        Mo[j + 1] = Mo[j];
                        Mo[j] = temp;


                        int e = rent[j + 1];
                        rent[j + 1] = rent[j];
                        rent[j] = e;

                        int f = day[j + 1];
                        day[j + 1] = day[j];
                        day[j] = f;
                    }
                }
            }
        }
        
        System.out.println("No\tName\tMobile\tBike\tRent\t\tDay\t\tTotal");
        System.out.println("................................................................................................................................");
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i+1)+"\t"+ Name[i] +"\t\t"+ Mo[i]+"\t\t"+bike[i] +"\t\t"+rent[i] +"\t\t"+day[i]+"\t\t"+rent[i]*day[i]+"\t\t\n");
            System.out.println("_______________________________________________________________________________________________________________________________");
        }
    }
}
