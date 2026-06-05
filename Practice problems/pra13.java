// A company has a follwing scheme for payment to their staff.
// net salary=gross salary - deduction
// gross salary= basic +da +hra+medical
// deduction = insurance +pf
// da=50% of basic hra=10% of basic medical=4% of basic pf=5%of gross  insurence = 7% of gross
// net_salary,gross,deduction,basic,da,hra,pf,medical,insurance

import java.util.Scanner;

public class pra13 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double net_salary,gross,deduction,basic,da,hra,pf,medical,insurance;
        System.out.println("Enter the basic salary:");
        basic = sc.nextInt();
        da= basic * (0.5);
        hra= basic *(0.1);
        medical= basic *(0.04);
        gross = basic+da+hra+medical;
        pf = gross*(0.05);
        insurance = gross*(0.05);
        deduction = insurance+pf;
        net_salary=gross-deduction;
        System.out.println(net_salary);



    }
}
