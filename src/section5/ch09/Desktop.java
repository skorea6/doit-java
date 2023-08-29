package section5.ch09;

public class Desktop extends Computer{
    // abstract 메소드는 무조건 재정의
    @Override
    public void display() {
        System.out.println("Desktop display");
    }

    @Override
    public void typing() {
        System.out.println("Desktop typing");
    }

    // abstract 아닌 메소드도 재정의 가능
    @Override
    public void turnOff() {
        System.out.println("Desktop turnoff");
    }
}
