package a0325.HomeWork;

public class Static {
    
}
// 클래스변수

class Counter1 {
    static int count = 0; // 클래스 변수
}

// 정적 메서드
// 정적 메서드(static method)는 인스턴스가 생성되지 않아도 클래스 이름을 통해 호출할 수 있는 메서드입니다.
// 정적 메서드는 객체의 상태에 의존하지 않는 경우에 사용됩니다.
// 예를 들어 유틸리티 메서드나 팩토리 메서드 등이 정적 메서드로 구현될 수 있습니다.
// 특징으로는 객체 생성없이 호출이 가능하다는점.
class MathUtil {
    static int add(int a, int b) {
        return a + b;
    }
}

// 정적 블록
// 정적 블록(static block)은 클래스가 로드될 때 실행되는 코드 블록입니다. 
// 정적 블록은 클래스 변수의 초기화나 클래스 관련 작업을 수행할 때 사용됩니다.


class Initialization {
    static {
        System.out.println("클래스 초기화 작업 수행");
        // 클래스 초기화 작업 수행
    }
}
