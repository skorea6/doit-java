package section4.ch02;

public class Car {
    private static int sequence = 10000;
    private final int id;

    public Car(){
        this.id = ++sequence;
    }

    public int getCarNum(){
        return id;
    }
}
