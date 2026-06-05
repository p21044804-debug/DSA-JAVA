
public class VarArgs {

     static int sum(int x,int ...arr){
        int result=x;
        for(int s:arr){
            result+=s;
        }
        return result;
    }

//    static int sum(int a,int b){
//         return a+b;
//    }
//    static int sum(int a,int b,int c){
//        return a+b;
//    }
//    static int sum(int a,int b,int c,int d){
//        return a+b;
//    }
    //method overloading
    public static void main(String[] args) {
        System.out.println("Welcome to VarArgs concept");
        System.out.println(sum(4,8));
        System.out.println(sum(1));
        System.out.println(sum(4,9,7,6));
    }
}
