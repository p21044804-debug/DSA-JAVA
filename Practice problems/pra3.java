import java.util.*;
public class pra3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age(year):");
        int age = sc.nextInt();
        int months=age*12;
        int week=age*52;
        int days=age*365;
        int hours=(days*24);
        int Miniutes = hours*60;
        int Seconds = Miniutes*60;
        System.out.println("Years:"+age+"\n Months:"+months +"\n weeks:"+week +"\n days:"+days+"\n hours:"+hours+"\n Miniutes:"+Miniutes+"\n Seconds:"+Seconds);
      sc.close();
    }
}
