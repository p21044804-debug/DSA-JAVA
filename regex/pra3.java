import java.util.*;


class Customers {
    Scanner sc = new Scanner(System.in);
    String customer_name;
    String[] product_name;
    int[] productprice;
    int[] productqty;
    int[] total, discount, dis_amt, net_tot;
    int itemNo;

    void ReadData() {
        while (true) {
            System.out.println("Please enter customer name:");
            customer_name = sc.nextLine();
            if (customer_name.matches("[A-Za-z ]+")) {
                System.out.println("Valid Input");
                break;
            } else {
                System.out.println("Invalid Input. Please enter alphabetic characters only.");
            }
        }

        while (true) {
            System.out.print("Enter the number of items: ");
            String item_No = sc.nextLine();
            if (item_No.matches("\\d+")) {
                itemNo = Integer.parseInt(item_No);
                System.out.println("Valid Input");
                break;
            } else {
                System.out.println("Invalid Input. Please enter digits only.");
            }
        }

        product_name = new String[itemNo];
        productprice = new int[itemNo];
        productqty = new int[itemNo];
        total = new int[itemNo];
        discount = new int[itemNo];
        dis_amt = new int[itemNo];
        net_tot = new int[itemNo];

        for (int i = 0; i < itemNo; i++) {
            System.out.println("\nEnter details for item " + (i + 1) + ":");

            while (true) {
                System.out.print("Product name: ");
                product_name[i] = sc.nextLine();
                if (product_name[i].matches("[A-Za-z ]+")) {
                    System.out.println("Valid Input");
                    break;
                } else {
                    System.out.println("Invalid Input. Please enter alphabetic characters only.");
                }
            }

            while (true) {
                System.out.print("Product price: ");
                String priceInput = sc.nextLine();
                if (priceInput.matches("\\d+")) {
                    productprice[i] = Integer.parseInt(priceInput);
                    System.out.println("Valid Input");
                    break;
                } else {
                    System.out.println("Invalid Input. Please enter digits only.");
                }
            }

            while (true) {
                System.out.print("Product quantity: ");
                String qtyInput = sc.nextLine();
                if (qtyInput.matches("\\d+")) {
                    productqty[i] = Integer.parseInt(qtyInput);
                    System.out.println("Valid Input");
                    break;
                } else {
                    System.out.println("Invalid Input. Please enter digits only.");
                }
            }

            total[i] = productprice[i] * productqty[i];

            // Fixed discount logic
            if (total[i] >= 1500) {
                discount[i] = total[i] * 15 / 100;
                dis_amt[i] = 15;
            } else if (total[i] >= 1000) {
                discount[i] = total[i] * 10 / 100;
                dis_amt[i] = 10;
            } else if (total[i] >= 500) {
                discount[i] = total[i] * 5 / 100;
                dis_amt[i] = 5;
            } else {
                discount[i] = total[i] * 2 / 100;
                dis_amt[i] = 2;
            }

            net_tot[i] = total[i] - discount[i];
        }
    }

    void ShowData() {
        System.out.println("\nCustomer: " + customer_name);
        System.out.println("Product\tTotal\tDiscount%\tDiscount Amt\tNet Total");
        for (int i = 0; i < product_name.length; i++) {
            System.out.println(
                    product_name[i] + "\t" + total[i] + "\t" + dis_amt[i] + "%\t\t" + discount[i] + "\t\t" + net_tot[i]);
        }
    }
}

public class pra3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of customers: ");
        int no = sc.nextInt();
        sc.nextLine(); // Consume newline

        Customers[] cs = new Customers[no];

        for (int i = 0; i < cs.length; i++) {
            System.out.println("\nEnter details for customer " + (i + 1) + ":");
            cs[i] = new Customers();
            cs[i].ReadData();
        }

        System.out.println("\n================== Total Bill ==================");
        for (Customers cus : cs) {
            cus.ShowData();
        }

        sc.close();
    }
}
