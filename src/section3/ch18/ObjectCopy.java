package section3.ch18;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibaray = new Book[5];

        library[0] = new Book("아몬드1", "조1");
        library[1] = new Book("아몬드2", "조2");
        library[2] = new Book("아몬드3", "조3");
        library[3] = new Book("아몬드4", "조3");
        library[4] = new Book("아몬드5", "조4");

        // 깊은 복사 진행
        for(int i=0; i<library.length; i++) {
            copyLibaray[i] = new Book(library[i].getTitle(), library[i].getAuthor());
        }

        // library 값을 변경
        library[0].setTitle("리눅스마스터");
        library[0].setAuthor("김민지");

        System.out.println("========= library =========");
        for(Book b : library) {
            b.showBookInfo();
        }

        System.out.println("========= copy library =========");

        // copy library 쪽에서는 값이 변경되지 않음!
        for(Book b : copyLibaray) {
            b.showBookInfo();
        }

    }

}
