package a0318.a;

public class Parent {
    protected int protectedField;

    protected void protectedMethod() {
        System.out.println("This is a protected method in Parent");
    }
}

// public: 모든곳에서 접근 가능 다른 패키지에서도 접근가능
// protected 동일한 패키지에서는 접근가능하고, 다른 패키지에서는 해당클래스를 상속한 경우(자식)에만 접근 가능하다.


// default : 접근제어자를 명시하지 않으면 default 
// 동일한 패키지 내에서만 접근 가능하다.

// private: 해당 클래스네에서만 접근 가능합니다.
// 다른 클래스에서는 접근할 수 없습니다.

// 접근제어자들을 적절히 사용하여 클래스, 메서드 , 변수들의 접근을 제어하여 캡슐화와 정보 은닉을 구현할 수 있다.



