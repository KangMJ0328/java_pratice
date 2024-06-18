package a0320.set;

import java.util.HashSet;
import java.util.Iterator;

public class Set1 {
    public static void main(String[] args) {
        HashSet<String> hs01 = new HashSet<String>();
        HashSet<String> hs02 = new HashSet<String>();
        // add()메소드를 이용한 요소의 저장
        hs01.add("홍길동");
        hs01.add("이순신");
        System.out.println(hs01.add("임꺽정"));
        System.out.println(hs01.add("임꺽정")); // 중복된 요소의 저장

        // Enhanced for 문과 get() 메소드를 이용한 요소의 출력
        for( String e : hs01){
            System.out.print(e+ " ");
        }
        System.out.println();

        // iterator() 메소드를 이용한 요소의 출력
        Iterator<String> iter02 = hs02.iterator();
        while (iter02.hasNext()){
            System.out.print(iter02.next() + " ");
        }
        System.out.println();

        //size()메소드를 이용한 요소의 총 개수
        System.out.println("집합의 크기 : " + hs02.size());
    }
}
// Set 컬렉션 클래스 
// Set 인터페이스를 구현한 모든 Set 컬렉션 클래스는 다음과 같은 특징
// 1. 요소의 저장순서를 유지하지 않는다.
// 2. 같은 요소의 중복저장을 허용하지 않습니다. 

// 대표적인 Set 
// 1. HashSet<E>
// 2. TreeSET<E>
