import java.util.Scanner;

class Hotel {
    Scanner sc = new Scanner(System.in);
    int arr[];
    String[] Name;
    String[] Mo;
    String[] bike;
    String[] rent;
    String[] day;
    int[] b_rent, b_day, b_Mo;

    void ReadData(int cus) {
        Name = new String[cus];
        Mo = new String[cus];
        bike = new String[cus];
        rent = new String[cus];
        day = new String[cus];
        b_day = new int[cus];
        b_rent = new int[cus];
        b_Mo = new int[cus];

        for (int i = 0; i < cus; i++) {

            while (true) {
                System.out.println("Enter customer name:");
                Name[i] = sc.nextLine();
                if (Name[i].matches("\\A-Za-z")) {
                    System.out.println("Valid Input");
                    break;
                } else {
                    System.out.println("Invalid Input. Please enter alphabets only.");
                }
            }

            while (true) {
                System.out.println("Enter mobile number:");//
                Mo[i] = sc.nextLine();
                if (Mo[i].matches("\\d+{10}")) {
                    b_Mo[i] = Integer.parseInt(Mo[i]);
                    System.out.println("Valid Input");
                    break;
                } else {
                    System.out.println("Invalid Input. Please enter digits only.");
                }
            }

            while (true) {
                System.out.println("Enter bike name:");
                bike[i] = sc.nextLine();
                if (bike[i].matches("\\A-Za-z")) {
                    System.out.println("Valid Input");
                    break;
                } else {
                    System.out.println("Invalid Input. Please enter alphabets only.");
                }
            }

            while (true) {
                System.out.println("Enter Rent :");//
                rent[i] = sc.nextLine();
                if (rent[i].matches("\\d+")) {
                    b_rent[i] = Integer.parseInt(rent[i]);
                    System.out.println("Valid Input");
                    break;
                } else {
                    System.out.println("Invalid Input. Please enter digits only.");
                }
            }

            while (true) {
                System.out.println("Enter days :");//
                day[i] = sc.nextLine();
                if (day[i].matches("\\d+")) {
                    b_day[i] = Integer.parseInt(day[i]);
                    System.out.println("Valid Input");
                    break;
                } else {
                    System.out.println("Invalid Input. Please enter digits only.");
                }
            }

        }

    }

    void ShowData() {

        for (int i = 0; i < rent.length; i++) {
            System.out.print((i + 1) + "\t" + Name[i] + "\t\t" + Mo[i] + "\t\t" + bike[i] + "\t\t" + rent[i] + "\t\t"
                    + day[i] + "\t\t" + b_rent[i] * b_day[i] + "\t\t\n");
            System.out.println(
                    "_______________________________________________________________________________________________________________________________");
        }
        int tot_days = 0;
        int tot_amount = 0;

        for (int i = 0; i < day.length; i++) {
            tot_days += b_day[i];
            tot_amount += b_rent[i] * b_day[i];

        }
        System.out.println("Total days" + tot_days);
        System.out.println("Total Amount" + tot_amount);
    }

    void AccendingData() {
        System.out.println("Are you want to print data in ascending order by rent or days? \n1. for day \n2. for rent");
        int a = sc.nextInt();

        if (a == 1) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (b_day[j] > b_day[j + 1]) {
                        String b = Name[j + 1];
                        Name[j + 1] = Name[j];
                        Name[j] = b;

                        String c = bike[j + 1];
                        bike[j + 1] = bike[j];
                        bike[j] = c;

                        int temp = b_Mo[j + 1];
                        b_Mo[j + 1] = b_Mo[j];
                        b_Mo[j] = temp;

                        int e = b_rent[j + 1];
                        b_rent[j + 1] = b_rent[j];
                        b_rent[j] = e;

                        int f = b_day[j + 1];
                        b_day[j + 1] = b_day[j];
                        b_day[j] = f;
                    }
                }
            }
        }

        if (a == 2) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (b_rent[j] > b_rent[j + 1]) {
                        String b = Name[j + 1];
                        Name[j + 1] = Name[j];
                        Name[j] = b;

                        String c = bike[j + 1];
                        bike[j + 1] = bike[j];
                        bike[j] = c;

                        int temp = b_Mo[j + 1];
                        b_Mo[j + 1] = b_Mo[j];
                        b_Mo[j] = temp;

                        int e = b_rent[j + 1];
                        b_rent[j + 1] = b_rent[j];
                        b_rent[j] = e;

                        int f = b_day[j + 1];
                        b_day[j + 1] = b_day[j];
                        b_day[j] = f;
                    }
                }
            }
        }

        System.out.println("No\tName\tMobile\tBike\tRent\t\tDay\t\tTotal");
        System.out.println(
                "................................................................................................................................");
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + "\t" + Name[i] + "\t\t" + Mo[i] + "\t\t" + bike[i] + "\t\t" + rent[i] + "\t\t"
                    + day[i] + "\t\t" + b_rent[i] * b_day[i] + "\t\t\n");
            System.out.println(
                    "_______________________________________________________________________________________________________________________________");
        }

    }
}

public class pra7 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many customers you want to add?");
        int cus = sc.nextInt();

        Hotel hotel = new Hotel();
        hotel.ShowData();

        System.out.println("No\tName\tMobile\tBike\tRent\t\tDay\t\tTotal");
        System.out.println(
                "................................................................................................................................");

        hotel.ReadData(cus);
        System.out.println("");
        System.out.println("");
        hotel.AccendingData();

        sc.close();

    }
}
