package section3.ch11;

public class Person {
    String name;
    int age;

    public Person() {
        this("이름없음", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person getPerson() {
        return this; // 자기 자신 반환 (Person 인스턴스 메모리 주소 반환)
    }


    public static void main(String[] args)
    {
        Person p = new Person();
        System.out.println(p.name + " " + p.age);
        System.out.println(p.getPerson()); // p 이름의 Person 인스턴스 메모리 주소
        System.out.println(p); // p 이름의 Person 인스턴스 메모리 주소
    }
}
