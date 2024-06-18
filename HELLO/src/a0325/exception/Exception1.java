package a0325.exception;

public class Exception1 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // ArithmeticException 발생(산술예외)
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
            System.out.println("예외메시지" + e.getMessage()); //예외에러메시지
            System.out.println("예외 클래스: " + e.getClass().getName());
             // 예외 클래스 이름 출력
             System.out.println("예외 발생 위치: " + e.getStackTrace()[0]);
             // 예외 발생 위치 출력
             e.printStackTrace(); // 예외 추적 정보 출력
        }
    }
}
