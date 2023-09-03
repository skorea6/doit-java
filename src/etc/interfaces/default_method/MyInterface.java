package etc.interfaces.default_method;

public interface MyInterface {
    void method1();

    default void method2() {
        System.out.println("interface - method2 실행");
    }
}
