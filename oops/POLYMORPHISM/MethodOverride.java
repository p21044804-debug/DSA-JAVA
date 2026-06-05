public class MethodOverride {
    static class A {
        protected void show() {
            System.out.println("Parent show()");
        }
    }
    static class B extends A {
        // super.show();
        public void show() {
            System.out.println("hello");
        }
    }
    public static void main(String[] args) {
        B b = new B();
        b.show();  // Output: Child show()
    }
}
