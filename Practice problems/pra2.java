import java.util.*;

public class pra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g1 = 0, g2 = 0, g3 = 0, g4 = 0, g5 = 0;
        // maths
        System.out.println("PLease Enter Maths Marks:");
        int math_marks = sc.nextInt();

        while (math_marks > 100) {
            System.out.println("Marks are not valid, Please Re-enter the marks");
            math_marks = sc.nextInt();
        }
        
        // science
        System.out.println("PLease Enter Science Marks:");
        int sci_marks = sc.nextInt();
        while (sci_marks > 100) {
            System.out.println("Marks are not valid, Please Re-enter the marks");
            sci_marks = sc.nextInt();
        }
       
        //
        System.out.println("PLease Enter English Marks:");
        int eng_marks = sc.nextInt();
        while (eng_marks > 100) {
            System.out.println("Marks are not valid, Please Re-enter the marks");
            eng_marks = sc.nextInt();
        }
        
        //
        System.out.println("PLease Enter Gujarati Marks:");
        int guj_marks = sc.nextInt();
        while (guj_marks > 100) {
            System.out.println("Marks are not valid, Please Re-enter the marks");
            guj_marks = sc.nextInt();
        }
        
        //
        System.out.println("PLease Enter Hindi Marks:");
        int hindi_marks = sc.nextInt();
        while (hindi_marks > 100) {
            System.out.println("Marks are not valid, Please Re-enter the marks");
            hindi_marks = sc.nextInt();
        }
        

        //
        System.out.println("-----------------------------------------------");
        int tot_marks, percent, tot_grace;

        tot_marks = (math_marks + sci_marks + eng_marks + guj_marks + hindi_marks);
       
        

        if(math_marks<35 || sci_marks<35 || eng_marks<35 || guj_marks<35 ||hindi_marks<35 ){ 
            
            if (math_marks < 35) {
                g1 = 35 - math_marks;
            }
            if (sci_marks<35){
                g2 = 35 - sci_marks;
            }
            if (eng_marks<35){
                g2 = 35 - sci_marks;
            }
            if (guj_marks<35){
                g2 = 35 - sci_marks;
            }
            if (hindi_marks<35){
                g2 = 35 - sci_marks;
            }

            tot_grace = (g1 + g2 + g3 + g4 + g5);
            if (tot_grace > 8) {
                System.out.println("You are not qulifed for next class.");
    
            } else {
                System.out.println("You have gain passing grace marks.");
    
            }
        }
        else{
        percent = tot_marks / 5;
        System.out.println("Percentage:" + percent + "%");
        
        if (percent > 85) {
            System.out.println("GRADE:A");
        } else if (percent > 75 || percent < 85) {
            System.out.println("GRADE:B");
        } else if (percent > 60 || percent < 75) {
            System.out.println("GRADE:C");
        } else if (percent > 55 || percent < 60) {
            System.out.println("GRADE:D");
        } else {
            System.out.println("GRADE:Fail");
        }
    }

    
        System.out.println("Total marks:" + tot_marks);
        System.out.println("Total grace:" + tot_grace);

        System.out.println("-----------------------------------------------");

        sc.close();
    }

}
