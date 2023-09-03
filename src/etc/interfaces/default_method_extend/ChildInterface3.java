package etc.interfaces.default_method_extend;

public interface ChildInterface3 extends ParentInterface{

    // 디폴트 메소드를 추상 메소드로 오버라이딩할 수 있음.
    @Override
    void method2();

    void method3();
}
