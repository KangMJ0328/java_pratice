package a0322.Object;

public class Object2 {
    public static void main(String[] args) {
        Car1 car01 = new Car1();
        Car1 car02 = new Car1();
        
        System.out.println(car01.toString());
        System.out.println(car02.toString());
        System.out.println(car01.equals(car02));
        car01 = car02;
        System.out.println(car01.equals(car02));
    }
    
}
class Car1{
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;

    public Car1(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    Car1(){
        this("아반떼",2016,"흰색",200);
    }
    public String getModel(){
        return this.modelYear + "년식" + this.modelName + " " + this.color;
    }
    //toString 메서드 오버라이드 
    // @Override
    // public String toString(){
    //     return "모델: " + this.modelName + ", 생산년도: " + this.modelYear + ", 색상: " + this.color + ", 최대속도: "+this.maxSpeed;
    // }
}

// Object클래스는 자바 클래스의 최고조상 
// Object클래스는 필드를 가지지 않으며, 총 11개의 메소드만으로 구성