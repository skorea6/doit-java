package etc.interfaces;

public interface RemoteControl {
    // 상수는 무조건 대문자로 작성
    // 값을 무조건 지정해야함
    // public static final 이 자동으로 붙음
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;


    // 추상 메소드
    // public abstract 자동으로 붙음
    // 선언만 하면 됨. 구현X
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    // 디폴트 메소드
    // public 자동으로 붙음
    // default 붙여야함
    // 실행블록을 가지고 있음
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
        }else{
            System.out.println("무읍 해제합니다.");
        }
    }

    // 정적 메소드
    // public 자동으로 붙음
    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }
}
