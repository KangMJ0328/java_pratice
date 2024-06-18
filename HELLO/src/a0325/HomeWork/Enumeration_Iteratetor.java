package a0325.HomeWork;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Enumeration_Iteratetor {
    // Enumeration
    // Enumeration은 읽기 전용(iterating-only)입니다. 요소를 추가하거나 수정하는 작업을 지원하지 않습니다.
    // 사용 메서드로는 hasMoreElements()와 nextElement() 두 가지 메서드를 제공합니다.
    //  hasMoreElements()는 다음 요소가 있는지 확인하고, nextElement()는 다음 요소를 반환합니다.

   
    // Iterator

    // Iterator는 읽기 및 삭제(read and remove) 작업을 지원합니다. 따라서 요소를 추가하거나 수정할 수 있습니다.
    // 사용 메서드로는 Iterator는 hasNext()와 next() 두 가지 메서드를 제공합니다. 
    // hasNext()는 다음 요소가 있는지 확인하고, next()는 다음 요소를 반환합니다.
    
}


class EnumerationExample {
    public static void main(String[] args) {
        // 벡터 생성
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        // Enumeration을 사용하여 요소 반복
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            String element = enumeration.nextElement();
            System.out.println(element);
        }
        // Vector 클래스의 elements() 메서드를 호출하여 Enumeration을 획득하고, hasMoreElements()와 nextElement() 메서드를 사용하여 요소를 반복합니다.
    }
}

class IteratorExample {
    public static void main(String[] args) {
        // ArrayList 생성
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Iterator를 사용하여 요소 반복
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
        // ArrayList 클래스의 iterator() 메서드를 호출하여 Iterator를 획득하고, hasNext()와 next() 메서드를 사용하여 요소를 반복합니다.
    }
}