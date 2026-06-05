//import java.util.Scanner;
//
//class customers {
//    Scanner sc = new Scanner(System.in);
//    String customer_name, product_name;
//    float product_price;
//    int product_qty;
//    int dis_amt;
//    float net_tot, total, discount;
//
//    void ReadData() {
//        System.out.println("Please enter customer name:");
//        customer_name = sc.nextLine();
//        System.out.println("Please enter product name:");
//        product_name = sc.nextLine();
//        System.out.println("Please enter product price:");
//        product_price = sc.nextInt();
//        System.out.println("Please enter product Quntity:");
//        product_qty = sc.nextInt();
//
//        total = (product_price * product_qty);
//        discount = 0;
//        if (total >= 1500) {
//            discount = total * 15 / 100;
//            dis_amt = 15;
//        } else if (total <= 1500 || total >= 1000) {
//            discount = total * 10 / 100;
//            dis_amt = 10;
//        } else if (total <= 1000 || total >= 500) {
//            discount = total * 5 / 100;
//            dis_amt = 5;
//        } else {
//            discount = total * 2 / 100;
//            dis_amt = 2;
//        }
//        net_tot = total - discount;
//    }
//
//    void ShowData() {
//        String formatted = String.format("%.2f", net_tot);
//
//        System.out.println("---------------------------------------------");
//        System.out.println(customer_name+"\t"+ product_name+"\t" + total+"\t"+ dis_amt + "%):\t" + discount+"\t"+ formatted+"\t");
//    }
//}
//
//public class pra2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of items: ");
//        int no = sc.nextInt();
//        customers[] cs = new customers[no];
//
//        for (int i = 0; i < cs.length; i++) {
//            System.out.println("\nEnter item " + (i + 1) + ":");
//            cs[i] = new customers();
//            cs[i].ReadData();
//
//        }
//
//        System.out.println("customer_name\t product_name\t total\t dis_amt (%):\t discount\t formatted\t");
//
//        for (customers cus: cs) {
//            cus.ShowData();
//        }
//
//        sc.close();
//    }
//}
