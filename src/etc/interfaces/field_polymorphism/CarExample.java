package etc.interfaces.field_polymorphism;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.run();

//        myCar.frontLeftTire = new KumhoTire();
//        myCar.frontRightTire = new KumhoTire();
//        myCar.run(); // 다형성

        myCar.tires[0] = new KumhoTire();
        myCar.tires[1] = new KumhoTire();
        myCar.run();
    }
}
