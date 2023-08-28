package section5.ch06;

import java.util.ArrayList;

class Animal{

    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    public void eating() {

    }
}

class Human extends Animal{
    @Override
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }

    public void readBooks() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal{
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}


class Eagle extends Animal{
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 날아갑니다.");
    }

    public void flying() {
        System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다");
    }
}



public class AnimalTest {

    public static void main(String[] args) {

        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        moveAnimal(hAnimal); // [2] 다형성이 지켜짐.
        moveAnimal(tAnimal);
        moveAnimal(eAnimal);

        System.out.println();

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        for(Animal animal : animalList) {
            animal.move(); // [1] 다형성이 지켜짐. move() => 같은 코드에서 여러 다른 실행 결과가 나옴. 하나의 코드가 여러 자료형으로 구현되어 실행되는 것.
        }

        System.out.println();
        testDownCasting(animalList); // 다운 캐스팅 (downCasting)
    }

    public static void moveAnimal(Animal animal) { // 매개변수의 다형성
        animal.move();
    }

    public static void testDownCasting(ArrayList<Animal> animals) {
        for (Animal animal : animals) {
            if (animal instanceof Human) { // instanceof 를 이용하여 인스턴스의 형 체크
                Human human = (Human) animal;
                human.readBooks();
            }else if(animal instanceof Tiger){
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            }else if(animal instanceof Eagle){
                Eagle eagle = (Eagle) animal;
                eagle.flying();
            }else{
                System.out.println("error");
            }
        }
    }
}
