package etc.nested.nested_class_object;

public class A {
    A(){
        System.out.println("A 객체가 생성");

//        B b = new B();
//        b.field1 = 3;
//        b.method1();
    }

    class B {
        int field1;
//        static int field2; 불가능.
        B(){
            System.out.println("B 객체가 생성됨");
        }
        void method1() {}
//            static void method2() {} 불가능
    }

    static class C{
        int field1;
        static int field2; // static 정적 변수 가능
        C(){
            System.out.println("C 객체가 생성됨");
        }
        void method1() {}
        static void method2() {} // static 정적 메소드 가능
    }

    void method(){
        class D{ // 로컬 클래스
            int field1;
//        static int field2; 불가능.
            D() {
                System.out.println("D 객체가 생성됨");
            }
            void method1(){}
//            static void method2() {} 불가능
        }

        D d = new D();
        d.field1 = 3;
        d.method1();
    }
}
