package section4.ch02;

import java.io.IOException;

public class CarTest {

    public static void main(String[] args) throws IOException {
        CarFactory factory = CarFactory.getInstance();
        Car mySonata = factory.createCar();
        Car yourSonata = factory.createCar();

        System.out.println(mySonata.getCarNum());     //10001 출력
        System.out.println(yourSonata.getCarNum());   //10002 출력
    }
}


















