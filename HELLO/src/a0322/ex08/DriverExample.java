package a0322.ex08;

public class DriverExample  {
    public static void main(String[] args) {
        //Driver 객체 생성
        Driver driver = new Driver();

        //Vehicel 구현 객체생성
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        //매개값으로 구현 객체 대입()
        driver.drive(bus); // 자동타입변환 -> 오버라이딩 메소드 호출 -> 다형성
        driver.drive(taxi); // 
        //자식이 부모타입으로 오버라이딩 

        // 1. Driver 클래스는 'drive()' 메서드를 가지고 있음
        // 이 메서드는 'Vehicle'인터페이스를 구현한 객첼르 매개변수로 받아서 운전 동작수행
        // 2. Bus 클래스와 taxi 클래스는 모두 vehicle 을 인터페이스를 구현한 구현체
        // 각각의 클래스는 Vehicle 인터페이스에 정의된 메서드 구현

    }
}
