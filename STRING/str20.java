import java.util.*;;

public class str20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String:");
        String str = sc.nextLine();
    
        System.out.println("Enter your word:");
        String str2 = sc.nextLine();

        String []result = str.split(" ");
        int found = 0;
        for(String word : result ){
            if(word.equalsIgnoreCase(str2)){
                found =1;
                break;
            }
           
        }
        if(found==1){
            System.out.println("Word is founded");
        }
        else{
            System.out.println("word not founded");
        }
    }
}