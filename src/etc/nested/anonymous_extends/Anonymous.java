package etc.nested.anonymous_extends;

public class Anonymous {
    /**
     * 필드 초기값
     */
    Person field = new Person() { // 익명 객체
        String studentNo; // 외부에서 사용 불가
        void work(){ // 외부에서 사용 불가
            System.out.println("출근합니다.");
        }
        @Override
        void wake() { // 외부에서 사용 가능!
            System.out.println("6시에 일어납니다.");
            work();
        }
    };

    /**
     * 로컬 변수 초기값
     */
    void method1(){
        Person localVar = new Person() { // 익명 객체
            String studentNo; // 외부에서 사용 불가
            void walk(){ // 외부에서 사용 불가
                System.out.println("산책합니다.");
            }
            @Override
            void wake() { // 외부에서 사용 가능!
                System.out.println("7시에 일어납니다.");
                walk();
            }
        };
        localVar.wake();
    }

    /**
     * 메소드의 매개값
     */
    void method2(Person person) {
        person.wake();
    }

}
