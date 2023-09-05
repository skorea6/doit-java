package etc.interfaces.extend;

public class Example {
    public static void main(String[] args) {
        ImplementationC impl = new ImplementationC();

        InterfaceA ia = impl;
        ia.methodA(); // methodA만 사용 가능

        InterfaceB ib = impl;
        ib.methodB(); // methodB만 사용 가능

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC(); // 전부 호출 가능
    }
}
