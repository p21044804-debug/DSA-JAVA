import java.util.*;

class Cricketer {
    Scanner sc = new Scanner(System.in);
    String name;
    int runs,tot_runs,avg_run;

    void Batsman() {

    
            System.out.println("Enter Batsman name:");
            name = sc.nextLine();
            System.out.println("Enter Runs:");
            runs = sc.nextInt();
             System.out.println("Enter total Runs:");
            tot_runs = sc.nextInt();
             System.out.println("Enter Average Runs:");
            avg_run = sc.nextInt();
        
        
    }

    void ShowData() {

        System.out.println(name + "\t" + runs+ "\t" +tot_runs+ "\t  " + avg_run);
    }
}

public class pra5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter how many player you want to enter");
        int playerNo = sc.nextInt();

        Cricketer[] cs = new Cricketer[playerNo];
        for (int i = 0; i < playerNo; i++) {
            System.out.println("\nEnter details of batsman " + (i + 1) + ":");
            cs[i] = new Cricketer();
            cs[i].Batsman();

        }

        System.out.println("\n================== Score ==================");
        System.out.println("name\truns\ttot_runs\tavg_run");

        for (Cricketer cric : cs) {
            cric.ShowData();
        }

        sc.close();
    }
}
