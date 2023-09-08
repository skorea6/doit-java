package etc.interfaces.field_polymorphism;

public class Car {
    // 배열이 인터페이스 타입일 경우 다양한 구현 객체를 대입할 수 있음
    Tire[] tires = {
            new HankookTire(),
            new HankookTire(),
            new HankookTire(),
            new HankookTire()
    };

    // 필드가 인터페이스 타입일 경우 다양한 구현 객체를 대입할 수 있음.
//    Tire frontLeftTire = new HankookTire();
//    Tire frontRightTire = new HankookTire();
//    Tire backLeftTire = new HankookTire();
//    Tire backRightTire = new HankookTire();

    void run() {
        for (Tire tire : tires) {
            tire.roll();
        }
//        frontLeftTire.roll();
//        frontRightTire.roll();
//        backLeftTire.roll();
//        backRightTire.roll();
    }
}
