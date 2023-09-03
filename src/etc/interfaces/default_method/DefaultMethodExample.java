package etc.interfaces.default_method;

public class DefaultMethodExample {
    public static void main(String[] args) {
        MyInterface m1 = new MyClassA();
        m1.method1();
        m1.method2(); // default method - interface

        MyInterface m2 = new MyClassB();
        m2.method1();
        m2.method2(); // m2 override method
    }
}
