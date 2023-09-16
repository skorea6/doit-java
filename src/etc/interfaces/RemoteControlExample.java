package etc.interfaces;

public class RemoteControlExample {
    public static void main(String[] args) {
        // 인터페이스 사용
        RemoteControl rc = null;
        rc = new Television();
        rc.turnOn(); // 구현 객체의 추상 메소드 사용
        rc.turnOff();

        rc = new Audio(); // 구현 객체를 인터페이스에 대입
        rc.turnOn();
        rc.turnOff();

        // 디폴트 메소드 사용 -> 구현 클래스에서 오버라이딩 가능
        rc.setMute(true); // 구현 객체가 인터페이스에 대입된 후 사용 가능
        // RemoteControl.setMute(true); 불가능


        // 정적 메소드 -> 인터페이스로 바로 호출 가능
        RemoteControl.changeBattery();

        // 익명 구현 객체
        RemoteControl rc2 = new RemoteControl() {
            private int volume; // 밖에서 사용 불가

            @Override
            public void turnOn() {
                System.out.println("티비를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("티비를 끕니다.");
            }

            @Override
            public void setVolume(int volume) {
                if(volume > RemoteControl.MAX_VOLUME){
                    this.volume = RemoteControl.MAX_VOLUME;
                } else if (volume < RemoteControl.MIN_VOLUME) {
                    this.volume = RemoteControl.MIN_VOLUME;
                }else{
                    this.volume = volume;
                }
                System.out.println("현재 티비 볼륨 : " + this.volume);
            }

            public void otherMethod(){} // 밖에서 사용 불가
        };


        // 다중 인터페이스 테스트
        SmartTelevision tv = new SmartTelevision();
        RemoteControl rc3 = tv;
        rc3.turnOn();
        rc3.turnOff();
        rc3.setVolume(5);

        Searchable searchable = tv;
        searchable.search("http://naver.com");


        
    }
}
