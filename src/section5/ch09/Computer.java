package section5.ch09;

public abstract class Computer {
    // 추상 메소드 : 선언만. 구현이 없음. -> 클래스를 반드시 abstract 추상 클래스로 선언해야함
    public abstract void display(); // 하위 클래스에 책임을 위임, 하위클래스에서 반드시 구현해야함
    public abstract void typing();

    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}
