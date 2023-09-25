package etc.nested.anonymous_extends;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();
        anonymous.field.wake();
        anonymous.method1();

        anonymous.method2(new Person() {
            String studentNo; // 외부에서 사용 불가
            void study(){ // 외부에서 사용 불가
                System.out.println("공부합니다.");
            }
            @Override
            void wake() { // 외부에서 사용 가능!
                System.out.println("8시에 일어납니다.");
                study();
            }
        });
    }
}
