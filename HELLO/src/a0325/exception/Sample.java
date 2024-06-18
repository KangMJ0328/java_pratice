package a0325.exception;


class FoolException extends RuntimeException {
}

public class Sample {
    public void sayNick(String nick) {
        if("바보".equals(nick)) {
            throw new FoolException();
        }
        System.out.println("당신의 별명은 "+nick+" 입니다.");
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.sayNick("바보");
        sample.sayNick("야호");
    }
}
//FoolException이 상속받은 클래스는 RuntimeException 
//1. RuntimeException: 실행 시 발생하는 예외
// -발생할 수도 있고 발생하지 않을 수도 있다.
//2. Exception 컴파일시 발생하는 예외 - 예측이 가능한 경우
