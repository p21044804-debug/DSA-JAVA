import java.util.*;
public class ass3{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer name?");
        sc.nextLine();
        String cus_name = sc.nextLine();

        System.out.println("Enter mobile number?");
        int mo = sc.nextInt();

        System.out.println("Enter city");
        sc.nextLine();
        String cus_city= sc.nextLine();

        System.out.println("Enter address");
        sc.nextLine();
        String cus_add = sc.nextLine();
        

        System.out.println("Enter how many scrap you want to add?");
        int scrap = sc.nextInt();

        int arr[] = new int[scrap];
        String[] scrape = new String[scrap];
        int [] wgt = new int[scrap];
       
        int[] amount = new int[scrap];
        


        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter scrap name:");
            sc.nextLine();
            scrape[i] = sc.nextLine();
           

            System.out.println("Enter weight:");//
            wgt[i] = sc.nextInt();
           

            System.out.println("Enter amount :");//
            amount[i] = sc.nextInt();

           
        }

        System.out.println("Customer Name:"+cus_name);
        System.out.println("Customer mobile:"+mo);
        System.out.println("Customer city:"+cus_city);
        System.out.println("Customer address:"+cus_add);

        System.out.println("No\tScrap type\tWeight\tAmount\t\tTotal Amount");
        System.out.println("................................................................................................................................");
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i+1)+"\t"+ scrape[i] +"\t\t"+ wgt[i]+"\t\t"+amount[i] +"\t\t"+wgt[i]*amount[i]+"\t\t\n");
            System.out.println("_______________________________________________________________________________________________________________________________");
        }
        int tot_wgt=0;
        int tot_amount=0;

        for (int i = 0; i < wgt.length; i++) {
            tot_wgt+=wgt[i];
            tot_amount+=wgt[i]*amount[i];

        }
        System.out.println("Total weight"+tot_wgt);
        System.out.println("Total Amount"+tot_amount);

        System.out.println("Are you want to print data in ascending order by weight or Amount? \n1. for Weight \n2. for Amount");
        int a = sc.nextInt();

        if (a == 1){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (wgt[j] > wgt[j + 1]) {
                        String b = scrape[j + 1];
                        scrape[j + 1] = scrape[j];
                        scrape[j] = b;

                        int temp = wgt[j + 1];
                        wgt[j + 1] = wgt[j];
                        wgt[j] = temp;


                        int e = amount[j + 1];
                        amount[j + 1] = amount[j];
                        amount[j] = e;

                    }
                }
            }
        }

        if (a == 2){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (amount[j] > amount[j + 1]) {
                        String b = scrape[j + 1];
                        scrape[j + 1] = scrape[j];
                        scrape[j] = b;

                        int temp = wgt[j + 1];
                        wgt[j + 1] = wgt[j];
                        wgt[j] = temp;


                        int e = amount[j + 1];
                        amount[j + 1] = amount[j];
                        amount[j] = e;

                    }
                }
            }
        }
        
        System.out.println("Customer Name:"+cus_name);
        System.out.println("Customer mobile:"+mo);
        System.out.println("Customer city:"+cus_city);
        System.out.println("Customer address:"+cus_add);

        System.out.println("No\tScrap type\tWeight\tAmount\t\tTotal Amount");
        System.out.println("................................................................................................................................");
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i+1)+"\t"+ scrape[i] +"\t\t"+ wgt[i]+"\t\t"+amount[i] +"\t\t"+wgt[i]*amount[i]+"\t\t\n");
            System.out.println("_______________________________________________________________________________________________________________________________");
        }

        System.out.println("Total weight"+tot_wgt);
        System.out.println("Total Amount"+tot_amount);
        sc.close();
    }
}