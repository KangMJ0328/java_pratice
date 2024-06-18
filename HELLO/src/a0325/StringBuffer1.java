package a0325;

public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Java");
        System.out.println("원본 문자열 : " + str);

        System.out.println(str.append("수업"));
        System.out.println("append() 메소드를 호출 후 원본 문자열 : " + str);
    }
}
// charAt() 메소드는 해당 문자열의 특정 인덱스에 해당하는 문자를반환

// String은 불변 클래스 