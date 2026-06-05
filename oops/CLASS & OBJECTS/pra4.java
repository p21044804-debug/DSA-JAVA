import java.util.Scanner;

class salary {
    Scanner sc = new Scanner(System.in);
    double net_salary, gross, deduction, basic, da, hra, pf, medical, insurance;
    String name;

    public void ReadData() {
        System.out.println("Enter the employee name:");
        name = sc.nextLine();
        System.out.println("Enter the basic salary:");
        basic = sc.nextInt();
        da = basic * (0.5);
        hra = basic * (0.1);
        medical = basic * (0.04);
        gross = basic + da + hra + medical;
        pf = gross * (0.05);
        insurance = gross * (0.05);
        deduction = insurance + pf;
        net_salary = gross - deduction;
    }

    void ShowData() {

       
        System.out.println(name+"\t"+basic+ "\t" + da + "\t" + hra + "\t" + medical + "\t" + gross + "\t" + pf + "\t" + insurance+ "\t" + deduction + "\t" + net_salary);
    }
}

public class pra4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many employee you want to enter:");
        int emp = sc.nextInt();
        salary[] s = new salary[emp];
        for (int i = 0; i < s.length; i++) {
            System.out.println("\nEnter emp salary " + (i + 1) + ":");
            s[i] = new salary();
            s[i].ReadData();

        }

                System.out.println("Name\tbasic\tda\thra\tmedical\tgross\tpf\tinsurance\tdeduction\tnet_salary");


        for (salary empSalary : s) {


            empSalary.ShowData();
            System.out.println("==========================================================");
        }
    }
}