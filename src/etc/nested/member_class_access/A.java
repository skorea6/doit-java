package etc.nested.member_class_access;

public class A {
    class B{}
    static class C{}

    // 인스턴스 필드
    B field1 = new B();
    C field2 = new C();

    // 인스턴스 메소드
    void method1(){
        B var1 = new B();
        C var2 = new C();
    }

    // 정적 필드
//    static B field3 = new B(); 불가능
    static C field4 = new C();

    // 정적 메소드
    static void method2(){
//        B var3 = new B(); 불가능
        C var4 = new C();
    }
}
