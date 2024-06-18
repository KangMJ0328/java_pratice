package a0315.Extends;

public class CarExample {
    public static void main(String[] args) {
        // Car 객체 생성
        Car myCar = new Car();

        //Tire 객체 장착
        myCar.tire = new Tire();
        myCar.run();

        //HankookTire 객체 장착
        myCar.tire = new HankookTire();
        myCar.run();

        //KumhoTire 객체 장착
        myCar.tire = new KumhoTire();
        myCar.run();

    }
}
class Tire{
    //메소드 선언 
    public void roll(){
        System.out.println("회전합니다.");
    }
}
class HankookTire extends Tire{
    @Override
    public void roll(){
        System.out.println("한국 타이어가 회전합니다.");
    }
    //자식의 클래스가 부모의 클래스의 메서드를 재정의하여
    //자신의 동작을 지정하는것
}
class KumhoTire extends Tire{
    @Override
    public void roll(){
        System.out.println("금호 타이어가 회전합니다.");
    }
}
class Car{
    //필드 선언
    public Tire tire;
    //Car 클래스는 Tire타입의 필드 tire를 가지고 있음
    //메서드 선언
    public void run(){
        //tire 필드에 대입된 객체의 roll() 메서드 호출
        tire.roll();    
    }
}