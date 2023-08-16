package section3.ch18;

public class BookArrayTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        library[0] = new Book("아몬드1", "조1");
        library[1] = new Book("아몬드2", "조2");
        library[2] = new Book("아몬드3", "조3");
        library[3] = new Book("아몬드4", "조3");
        library[4] = new Book("아몬드5", "조4");

        for(Book b : library) {
            System.out.println(b);
            b.showBookInfo();
        }
    }
}
