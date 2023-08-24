package etc.abstract_method;

public class AnimalExample {
    public static void main(String[] args) {
//        Animal animal1 = new Animal(); // abstract 추상화 클래스는 인스턴스화 불가능

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        cat.sound();
        System.out.println("-----------");

        Animal animal = new Dog();
        animal.sound(); // dog sound

        animal = new Cat();
        animal.sound(); // cat sound

        System.out.println("-----------");
        animalSound(new Dog());
        animalSound(new Cat());
    }

    // animal 에는 어떤 타입도 올 수 있음 : Dog 혹은 Cat 타입
    public static void animalSound(Animal animal) {
        animal.sound(); // dog 혹은 cat sound
    }
}
