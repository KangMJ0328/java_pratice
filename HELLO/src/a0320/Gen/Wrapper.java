package a0320.Gen;

public class Wrapper {
    public static void main(String[] args) {
        //Wrapper 클래스 
        // 프로그램에 따라 기본 타입의 데이터를 객체로 취급해야하는 경우
        // 메소드의 인수로 객체 타입만이 요구되면, 기본타입의 데이터를 사용할 수 없다.
        // 기본타입 => 객체타입 변환 후 작업 수행
        // 기본타입 => Wrapper 클래스
        // byte => Byte
        // short =? Short
        // int => Integer
        // long => Long
        // char => Character
        // boolean => Boolean
        Integer num = Integer.valueOf(17); // 박싱
        
        int n = num.intValue(); //언박싱
        System.out.println(n);

        Character ch = 'X'; // Character ch = new Character('X'); : 오토박싱
        char c = ch; // char c = ch.charValue(); :오토 언박싱
        System.out.println(c);

    }
    
}
