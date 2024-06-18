package a0325.exception;

public class Exception2 {
    public static void main(String[] args) {
        String str = null; //널 포인터 예외
        try {
            int length = str.length(); // NullPointerException 발생
            System.out.println("문자열 길이: " + length);
        } catch (NullPointerException e) {
            System.out.println("문자열이 null입니다.");
        }
    }
}
