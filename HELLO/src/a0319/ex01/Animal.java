package a0319.ex01;

public abstract class Animal {
    //메소드 선언
    public void breathe(){
        System.out.println("숨을 쉽니다.");
    }
    //추상 메소드 선언
    public abstract void sound();

    // 추상메서드는 메서드의 시그니처(이름,매개변수,반환타입)을 가지고있지만 
    // 메서드 구현 내용이 없는 메서드
    // 추상메서드는 자식클래스에서 반드시 재정의(구현) 되어야 한다.
}
