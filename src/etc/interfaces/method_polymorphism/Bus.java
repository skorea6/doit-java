package etc.interfaces.method_polymorphism;

public class Bus implements Vehicle{
    @Override
    public void run() {
        System.out.println("버스입니다.");
    } 
}
