package etc.nested.field_method_access;

public class A {
    int field1;
    void method1() {}

    static int field2;
    static void method2() {}

    class B{
        void method(){
            field1 = 10;
            method1();

            field2 = 10;
            method2();
        }
    }

    static class C{
        void method(){
//            field1 = 10; 불가능
//            method1(); 불가능

            field2 = 10;
            method2();
        }
    }
}
