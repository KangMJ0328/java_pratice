package a0315;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        //add() 메소드를 이용한 요소의 저장

        arrList.add(40);
        arrList.add(20);
        arrList.add(30);
        arrList.add(10);
        System.out.println(arrList.size());
        for(int i = 0; i<arrList.size();i++){
            // System.out.print(arrList.get(i)+ "  ");
        }
        // System.out.println();
        //remove() 메소드를 이용한 요소의 제거
        arrList.remove(1);

        //Enhanced for문과 get() 메소드
        for (int e : arrList){
            System.out.print(e + "  ");
        }
        // System.out.println();
        //collections.sort() 메소드를 이용한 요소의 정렬
        Collections.sort(arrList);
        // System.out.print(arrList);
        System.out.println();
        // iterator() 메소드와 get() 메소드를 이용한 요소의 출력
        Iterator<Integer> iter = arrList.iterator();
        while ( iter.hasNext()){
            System.out.print(iter.next()+ " ");
        }
        System.out.println();

        //set()메소드를 이용한 요소의 변경
        arrList.set(0, 20);
        for(int e: arrList){
            System.out.print(e+ " ");
        }
        System.out.println();

        arrList.add(0,10);
        for(int e: arrList){
            System.out.print(e+ " ");
        }
    }
    
}
