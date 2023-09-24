package etc.nested.nested_interface;

public class Button {
    OnClickListener listener;

    // 매개변수의 다형성 (다양한 객체가 들어올 수 있음)
    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.onClick();
    }

    // 해당 클래스에서만 사용하는..
    interface OnClickListener{
        void onClick();
    }
}
