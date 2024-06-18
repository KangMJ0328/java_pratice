package a0320.Gen;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(10);
        String str = (String)list.get(0); // 형변환 필요
        int num = (int) list.get(1); // 형변환 필요 , 런타임 오류 발생 가능성
        
        

        
    }
    
}
