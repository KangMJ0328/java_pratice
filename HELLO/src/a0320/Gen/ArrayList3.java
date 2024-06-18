package a0320.Gen;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Hello");
        // list.add(10); - 컴파일 오류발생
        String str = list.get(0); // 형변환 필요
        // 제네릭을 사용하여 ArrayList 클래스명을 지정함으로써 
        // 타입의 안정성을 보장한다.
   
    }
}
