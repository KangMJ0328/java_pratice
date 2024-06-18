package a0312.car2;

public class Car {
   //필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 선언
	Car() {}
    Car(String model) {
		this.model = model;
	}
    Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
    Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
    //생성자 오버로딩 - 같은 클래스 내에  여러개의 생성자를 정의
    //각생성자는 서로다른 매개변수 목록을 가지거나 매개변수 의 타입이나
    //갯수가 다를 수 있다.

    // 장점 : 동일한 클래스에서 여러가지 방식으로 객체를 초기화
    // 유연성을 제공하며 다양한 상황에서 객체를 생성할 수 있다.

}
