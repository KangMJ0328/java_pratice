package a0325.HomeWork;

public class InstanceVSstatic {
    public static void main(String[] args) {
        Car car1 = new Car("Red");
        Car car2 = new Car("Blue");
        
        car1.displayColor(); // "차량의 색상: Red"
        car2.displayColor(); // "차량의 색상: Blue"

        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();
        
        Counter.displayCount(); // "생성된 객체 수: 3"
    }
}

class Car {
    String color; // 멤버 변수 - 각 차량마다 색상이 다를 수 있음
    
    public Car(String color) {
        this.color = color; // 생성자를 통해 색상을 초기화
    }
    
    public void displayColor() {
        System.out.println("차량의 색상: " + color);
    }
}

class Counter {
    static int count = 0; // 클래스 변수 - 모든 인스턴스가 공유하는 카운터
    
    public Counter() {
        count++; // 객체 생성 시 카운터 증가
    }
    
    public static void displayCount() {
        System.out.println("생성된 객체 수: " + count);
    }
}
