package a0318.exam02;

public class Phone {
    //필드 선언
	public String model;
	public String color;
   
    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Phone(String model, String color) 생성자 실행");
    }
}
