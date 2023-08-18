package section4.ch02;

public class CarFactory {
    // 싱글톤 패턴
    // 인스턴스 딱 1개만 미리 생성해둠.
    // static -> global 과 유사. 인스턴스 생성 이전에 생성, 인스턴스 객체끼리 같은 값 공유.
    // public static 이 써져있다는거? 외부에서 CarFactory.getInstance() 로 호출 가능.
    private static final CarFactory instance = new CarFactory();

    private CarFactory(){
    }

    public static CarFactory getInstance(){
        return instance;
    }

    public Car createCar(){
        return new Car();
    }

}
