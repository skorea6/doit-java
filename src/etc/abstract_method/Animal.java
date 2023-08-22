package etc.abstract_method;

public abstract class Animal {
    public String kind;

    public void breathe() {
        System.out.println("숨 쉬기");
    }

    public abstract void sound();
}
