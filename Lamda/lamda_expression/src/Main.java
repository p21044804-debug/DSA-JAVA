

interface DemoAno{
    void meth1();
    void meth2();
}

class AnonyDemo implements DemoAno{
    public void display(){
        System.out.println("hello");
    }
    public  void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
}

public class Main {

    public static void main(String[] args) {

        AnonyDemo obj =new AnonyDemo();
        obj.meth1();
    }
}