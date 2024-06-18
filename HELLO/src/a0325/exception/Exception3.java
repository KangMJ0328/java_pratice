package a0325.exception;

public class Exception3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3}; //배열 인텍스 예외
        try {
            int value = arr[3]; // ArrayIndexOutOfBoundsException 발생
            System.out.println("배열 요소: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱스가 범위를 벗어났습니다.");
        }
    }
}
