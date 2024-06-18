package a0325.HomeWork;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_VS_LinkedList {
    // 요소의 접근이나 검색이 많은 경우에는 ArrayList를 사용하는 것이 좋고,
    // 요소의 삽입/삭제가 빈번하게 일어나는 경우에는 LinkedList를 사용하는 것이 유리합니다.
    // ArrayList는 요소의 접근이 빠르고 배열의 크기는 자동적으로 조절됨 메모리사용량이 LinkedList에 비해 적음 
    // LinkedList는 이중 연결 리스트로 구현되고 각 요소는 자신의 이전 요소와 다음 요소에 대한 참조를 가지고 있다.
    // 특히 이중연결리스트는 양방향으로 연결된 리스트이며 단일리스트가 단일변수만으로 갖고있었다면 변수를 하나 더 추가해서 사용된다.
}

// ArrayList 예제


class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList 생성
        ArrayList<String> list = new ArrayList<>();

        // 요소 추가
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // 요소 접근 및 출력
        System.out.println("Elements in ArrayList:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // 요소 삭제
        list.remove("Banana");

        // 변경된 요소 출력
        System.out.println("Elements after removal:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}

// LinkedList 예제


class LinkedListExample {
    public static void main(String[] args) {
        // LinkedList 생성
        LinkedList<String> list = new LinkedList<>();

        // 요소 추가
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // 요소 접근 및 출력
        System.out.println("Elements in LinkedList:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // 요소 삭제
        list.remove("Banana");

        // 변경된 요소 출력
        System.out.println("Elements after removal:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}


