package a0322.Map;

import java.util.Iterator;
import java.util.LinkedList;

public class Iterator1 {
    public static void main(String[] args) {
        LinkedList<Integer> lnkList = new LinkedList <Integer>();

        lnkList.add(4);
        lnkList.add(2);
        lnkList.add(3);
        lnkList.add(1);

        Iterator<Integer> iter  = lnkList.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next()+ " ");
        }
    }
}
// Iterator<E>
// 자바의 컬렉션 프레임워크는 컬렉션에 저장된 요소를 읽어오는 방법을
// Iterator 인터페이스로 표준화하고 있습니다.