package section3.ch20;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // ------ add --------
        list.add("Java"); // 추가
        list.add("ArrayList");
        list.add(1, "Test");
        System.out.println("[값 추가 후] " + list);

        // ------ set --------
        list.set(1, "Korea"); // 변경
        System.out.println("[값 변경 후] " + list);

        // ------ size --------
        System.out.println("[배열의 크기] " + list.size());

        // ------ for문 --------
        System.out.print("[배열 출력하기] ");
        for(String s : list){
            System.out.print(s + " # ");
        }
        System.out.println();

        // ------ contains, indexOf --------
        System.out.println("[값 검색(contains)] " + list.contains("Korea")); // true
        System.out.println("[값 검색(indexOf)] " + list.indexOf("Monday")); // 값이 없으면 -1

        // ------ remove, clear --------
        list.remove(1);
        System.out.println("[값 삭제 후 - 1] " + list);
        list.remove("Java");
        System.out.println("[값 삭제 후 - 2] " + list);
        list.clear();
        System.out.println("[값 전체 삭제 후] " + list);

        // ------ isEmpty --------
        System.out.println("[배열 비었는지] " + list.isEmpty());
    }
}
