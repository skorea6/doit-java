package etc.nested.nested_interface;

public class ButtonExample {
    public static void main(String[] args) {
        Button button = new Button();

        button.setOnClickListener(new CallListener());
        button.touch();

        button.setOnClickListener(new MessageListener());
        button.touch();

        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("사진을 찍습니다.");
            }
        });
        button.touch();


        System.out.println();

        Window window = new Window();
        window.button1.touch();
        window.button2.touch();
    }
}
