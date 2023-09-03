package etc.interfaces.default_method_extend;

public interface ParentInterface {
    void method1();

    default void method2() {
        System.out.println("ParentInterface - method2 실행");
    }
}
