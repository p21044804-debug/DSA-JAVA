import java.util.*;
public class JavaTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of day");
        
        int day=sc.nextInt();
        if(!(day>=1&&day<=30)){
            System.out.println("You have enter the wrong day");
        }

        int rem = ((day - 1) % 7) + 1;
        switch(rem){
            case 1: 
            System.out.println("Sunday");
            break;
            case 2: 
            System.out.println("monday");
            break;
            case 3: 
            System.out.println("tuesday");
            break;
            case 4: 
            System.out.println("wednesday");
            break;
            case 5: 
            System.out.println("thrusday");
            break;
            case 6: 
            System.out.println("friday");
            break;
            case 7: 
            System.out.println("saturday");
            break;
            default: 
            System.out.println("Enter the value in correct range(from 1 to 30)");
            
        }
    }
}
