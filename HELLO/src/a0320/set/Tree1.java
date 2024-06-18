package a0320.set;

import java.util.Iterator;
import java.util.TreeSet;


public class Tree1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();

        // add() 메소드를 이용한 요소의 저장
        ts.add(30);
        ts.add(40);
        ts.add(20);
        ts.add(10);

        //Enhanced for 문과 get()메소드를 이용한 요소의 출력
        for (int e: ts){
            System.out.print(e+ " ");
        }
        System.out.println();

        ts.remove(40);

        // iterator() 메소드를 이용한 요소의 출력
        Iterator<Integer> iter = ts.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        // size() 메소드를 이용한 요소의 총 개수
        System.out.println("이진 검색 트리의 크기 : "+ ts.size());

        //subSet() 메소들르 이용한 부분 집합의 출력
        System.out.println(ts.subSet(10,20)); //10 이상 20 미만
        System.out.println(ts.subSet(10, true,20,true)); // 10 이상 20 이하
    }
    
}
