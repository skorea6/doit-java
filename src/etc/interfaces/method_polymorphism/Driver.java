package etc.interfaces.method_polymorphism;

public class Driver {
    // 매개변수의 다형성
    public void drive(Vehicle vehicle) {
        vehicle.run();
    }
}
