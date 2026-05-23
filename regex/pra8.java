import java.util.regex.*;
public class pra8 {
    public static void main(String[] args) {
        String s ="P12a45v09a;n__@1205";
        Pattern p = Pattern.compile("['0-9']");
        Matcher m = p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
