package a0320.steck;
import java.util.Stack;
public class Steck {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>(); //스택의 생성

        // push() 메소드를 이용한 요소의 저장
        st.push(4);
        st.push(2);
        st.push(3);
        st.push(1);

        System.out.println(st.peek()); // 현재 스택의 맨 위에 있는 요소를 화면에 출력
        System.out.println(st);
        // System.out.println(st.getClass().getName());

        // pop() 메소드를 이용한 요소의 반환 및 제거
        System.out.println(st.pop()); 
        System.out.println(st);

        // search() 메소드를 이용한 요소의 위치 검색
        System.out.println(st.search(4));  // search는 위부터 찾는다. 오른쪽부터 1 그래서 4는 3번째에있다.
        System.out.println(st.search(3)); // 3은 1번쨰에있기떄문에 1 

        // LIFO(Last in First out)

    }
    
}
