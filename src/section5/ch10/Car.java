package section5.ch10;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("시동 키기");
    }

    public void turnOff() {
        System.out.println("시동 끄기");
    }

    // 변하면 안되기 때문에 final -> 템플릿 메소드
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
    }
}
