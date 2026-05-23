import java.util.Scanner;

class customers {
    Scanner sc = new Scanner(System.in);
    String customer_name;
    String[] product_name;
    float[] product_price;
    int[] product_qty;
    int[] dis_amt;
    float[] net_tot, total, discount;

    void ReadData() {
        System.out.println("Please enter customer name:");
        customer_name = sc.nextLine();

        System.out.print("Enter the number of items: ");
        int itemNo = sc.nextInt();

        product_name = new String[itemNo];
        product_price = new float[itemNo];
        product_qty = new int[itemNo];
        dis_amt = new int[itemNo];
        net_tot = new float[itemNo];
        total = new float[itemNo];
        discount = new float[itemNo];

        for (int i = 0; i < itemNo; i++) {
            System.out.println("\nEnter details for item " + (i + 1) + ":");
            System.out.print("Product name: ");
            product_name[i] = sc.nextLine();
            System.out.print("Product price: ");
            product_price[i] = sc.nextFloat();
            System.out.print("Product quantity: ");
            product_qty[i] = sc.nextInt();
            sc.nextLine();

            total[i] = product_price[i] * product_qty[i];
            if (total[i] >= 1500) {
                discount[i] = total[i] * 15 / 100;
                dis_amt[i] = 15;
            } else if (total[i] <= 1500 || total[i] >= 1000) {
                discount[i] = total[i] * 10 / 100;
                dis_amt[i] = 10;
            } else if (total[i] <= 1000 || total[i] >= 500) {
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

        for (int i = 0; i < product_name.length; i++) {
            System.out.println(
                    product_name[i] + "\t" + total[i] + "\t" + dis_amt[i] + "\t" + discount[i] + "\t" + net_tot[i]);
        }
    }
}

public class pra3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of customers: ");
        int no = sc.nextInt();

        customers[] cs = new customers[no];

        for (int i = 0; i < cs.length; i++) {
            System.out.println("\nEnter item " + (i + 1) + ":");
            cs[i] = new customers();
            cs[i].ReadData();

        }

        System.out.println("\n================== Total Bill ==================");

        for (customers cus : cs) {
            cus.ShowData();
        }

        sc.close();
    }
}
