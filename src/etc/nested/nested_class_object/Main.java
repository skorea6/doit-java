package etc.nested.nested_class_object;

public class Main {
    public static void main(String[] args) {
        // 인스턴스 멤버 클래스
        A a = new A();
        A.B b = a.new B();
        b.field1 = 3;
        b.method1();

        System.out.println("-------");

        // 정적 멤버 클래스
        A.C c = new A.C();
        c.field1 = 3;
        c.method1();
        A.C.field2 = 3;
        A.C.method2();

        System.out.println("-------");

        // 로컬 클래스
        a.method();
        // 직접적으로 D 클래스에 접근할 수는 없음
    }
}
