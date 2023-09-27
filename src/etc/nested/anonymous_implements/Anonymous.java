package etc.nested.anonymous_implements;

public class Anonymous {
    // 필드의 초기값
    RemoteControl field = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV를 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다.");
        }
    };

    // 로컬 변수의 초기값
    void method1() {
        RemoteControl localVar = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Audio를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("Audio를 끕니다.");
            }
        };
        localVar.turnOn();
        localVar.turnOff();
    }

    // 매개변수의 매개값
    void method2(RemoteControl remoteControl) {
        remoteControl.turnOn();
        remoteControl.turnOff();
    }
}
