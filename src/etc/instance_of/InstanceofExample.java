package etc.instance_of;

public class InstanceofExample {
    // 매개변수 parent 에 Child 혹은 Parent 타입이 들어올 수도 있음
    // 다만, 형변환을 하려면 '자식 타입'인 Child 타입만이 와야하므로, instanceof 로 Child 타입인지 체크해야함.

    // 객체 instanceof 타입
    // parent 객체가 Child 타입인지 확인
    public static void method1(Parent parent) {
        if(parent instanceof Child){
            Child child = (Child) parent;
            System.out.println("[method1] Child 로 변환 성공");
        }else{
            System.out.println("[method1] Child 로 변환 실패");
        }
    }

    public static void method2(Parent parent) {
        Child child = (Child) parent;
        System.out.println("[method2] Child 로 변환 성공");
    }

    public static void main(String[] args) {
        Parent parentA = new Child(); // Child 타입
        method1(parentA); // 성공
        method2(parentA); // 성공

        Parent parentB = new Parent(); // Parent 타입
        method1(parentB); // 실패
        method2(parentB); // ClassCastException 터짐!!
    }
}
