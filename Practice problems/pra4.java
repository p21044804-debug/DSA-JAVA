import java.util.*;
public class pra4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
       System.out.println("Please enter customer name:");
       String customer_name = sc.nextLine();
       System.out.println("Please enter product name:");
       String product_name = sc.nextLine();
       System.out.println("Please enter product price:");
       float product_price = sc.nextInt();
       System.out.println("Please enter product Quntity:");
       int product_qty = sc.nextInt();
       int dis_amt;
      
       float total =(product_price * product_qty);
       float discount = 0;
       if(total>=1500){
        discount=total*15/100;
        dis_amt=15;
       }
       else if (total<=1500 || total>=1000){
        discount=total*10/100;
        dis_amt=10;
       }
       else if (total<=1000 || total>=500){
        discount=total*5/100;
        dis_amt=5;
       }
       else{
        discount=total*2/100;
        dis_amt=2;
       }
       float net_tot=total-discount;
       String formatted = String.format("%.2f", net_tot);

       System.out.println("---------------------------------------------");
       System.out.println("Total:"+total);
       System.out.println("Discount("+dis_amt+"%):"+discount);
       System.out.println("Net total:"+formatted);
       System.out.println("Thanks "+customer_name+"for Shopping "+ product_name);
       
       sc.close();
    }
}
