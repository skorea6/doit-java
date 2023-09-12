package etc.interfaces.method_polymorphism;

public class Taxi implements Vehicle {
    @Override
    public void run() {
        System.out.println("택시입니다.");
    }
}
