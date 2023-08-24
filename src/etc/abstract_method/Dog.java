package etc.abstract_method;

public class Dog extends Animal{
    public Dog() {
        this.kind = "포유류";
    }

    // 하위 클래스가 무조건 상위 클래스의 추상 메소드를 재정의해야함
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
