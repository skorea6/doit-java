package etc.interfaces.instance_of;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("버스입니다.");
    }

    public void checkFare(){
        System.out.println("승차 요금 계산");
    }
}
