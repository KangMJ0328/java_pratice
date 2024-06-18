package a0320.list;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> lnkList = new LinkedList<String>();
        //add() 메소드를 이용한 요소의 저장
        lnkList.add("넷");
        lnkList.add("둘");
        lnkList.add("셋");
        lnkList.add("하나");

        //for 문과 get() 메소들르 이용한 요소의 출력
        for ( int i = 0 ; i <lnkList.size(); i++){
            System.out.print(lnkList.get(i) + " ");
        }
        System.out.println();

        // remove() 메소드를 이용한 요소의 제거

        lnkList.remove(1);

        // Enhanced for 문과 get() 메소드를 이용한 요소의 출력

        for(String e : lnkList){
            System.out.print(e + " ");
        }
    }
    
}
// Vector<E> 클래스
// Vector 클래스에서 사용할 수 있는 메소드는
// ArrayList 클래스에서 사용할 수 있는 메소드와 거의 같습니다.