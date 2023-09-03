package section5.ch09;

public class ComputerTest {
    public static void main(String[] args) {
        // Desktop 과 MyNoteBook 은 인스턴스화 가능
        // Computer, NoteBook 은 추상 클래스이기 때문에 인스턴스화 불가능
        Computer desktop = new Desktop();
        desktop.display();
        desktop.turnOff();

        Computer noteBook = new MyNoteBook();
        noteBook.display();
        noteBook.typing();
    }
}
