package a0320.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
      ArrayList<Integer> arrList =  new ArrayList<>();
        // add() 메소드를 이용한 요소의 저장
        arrList.add(40);
        arrList.add(20);
        arrList.add(30);
        arrList.add(10);
        // for 문과 get() 메소드를 이용한 요소의 출력
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
        System.out.println();

        // Enhanced for 문과 get() 메소드를 이용한 요소의 출력
        for (int e : arrList) {
            System.out.print(e + " ");
        }

        // for (Student s : students) {
        //     System.out.print(s + " ");
        // }
        System.out.println();

        // Collections.sort() 메소드를 이용한 요소의 정렬
		Collections.sort(arrList);

        // iterator() 메소드와 get() 메소드를 이용한 요소의 출력
		Iterator<Integer> iter = arrList.iterator();
        //arrList의 반복자를 반환
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
        // set() 메소드를 이용한 요소의 변경
        arrList.set(0, 20);

        for (int e : arrList) {
        System.out.print(e + " ");
        }
        System.out.println();

        // size() 메소드를 이용한 요소의 총 개수
		System.out.println("리스트의 크기 : " + arrList.size());
        
        // remove() 메소드를 이용한 요소의 제거
		arrList.remove(1);
		
		
		for (int e : arrList) {
			System.out.print(e + " ");
		}
		System.out.println();
        arrList.add(1,90);
       
        for (int e : arrList) {
			System.out.print(e + " ");
		}
		System.out.println();


    }
}

//List 컬렉션 클래스
//List 인터페이스를 구현한 모든 List 컬렉션 클래스는 다음과 같은 특징을 가진다.
//1.요소의 저장순서 유지
//2.같은 요소의 중복저장도 허용
//List 컬렉션 클래스에 속하는 클래스는 다음과 같습니다.
//1. ArrayList<E>
//2. LinkedList<E>
//3. Vector<E>
//4. Stack<E>
