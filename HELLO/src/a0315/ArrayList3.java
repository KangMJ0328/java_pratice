package a0315;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        //ArrayList<String> - 제네릭스로 자료형을 선언 
        ArrayList<String> pitches = new ArrayList<String>();
        pitches.add("138");
        pitches.add("129");

        String one = (String) pitches.get(0);
        String two = (String) pitches.get(1);
        System.out.println("요소 0번에는" + one);
        System.out.println("요소 1번에는" + two);
    }
    
}
