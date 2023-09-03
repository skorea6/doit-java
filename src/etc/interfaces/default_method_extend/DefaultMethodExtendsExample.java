package etc.interfaces.default_method_extend;

public class DefaultMethodExtendsExample {
    public static void main(String[] args) {
        // 디폴트 메소드를 단순히 상속만 받았을때
        ChildInterface1 c1 = new ChildInterface1(){
            @Override
            public void method1() {
                System.out.println("c1 - method1");
            }

            @Override
            public void method3() {
                System.out.println("c1 - method3");
            }
        };

        c1.method1(); // override
        c1.method2(); // default method - parent interface
        c1.method3(); // override

        System.out.println();

        // ChildInterface2에서 디폴트 메소드 재정의할 경우
        ChildInterface2 c2 = new ChildInterface2(){
            @Override
            public void method1() {
                System.out.println("c2 - method1");
            }

            @Override
            public void method3() {
                System.out.println("c2 - method3");
            }
        };

        c2.method1(); // override
        c2.method2(); // default method - child interface
        c2.method3(); // override

        System.out.println();

        // 디폴트 메소드를 추상 메소드(method3)로 재선언하였기 때문에 인터페이스를 이용해서 구현할때 method3 메소드를 재정의해주어여함.
        ChildInterface3 c3 = new ChildInterface3(){
            @Override
            public void method1() {
                System.out.println("c3 - method1");
            }

            @Override
            public void method2() {
                System.out.println("c3 - method2");
            }

            @Override
            public void method3() {
                System.out.println("c3 - method3");
            }
        };

        c3.method1(); // override
        c3.method2(); // override - c3
        c3.method3(); // override
    }
}
