package etc.interfaces.default_method_extend;

public interface ChildInterface2 extends ParentInterface{
    // 디폴트 메소드 오버라이딩
    @Override
    default void method2() {
        System.out.println("ChildInterface2 - method2 실행");
    }

    void method3();
}
