package a0318.test;

public class N_11 {
    public static void main(String[] args) {
        Car car1 = new Car("자동차1","빨강",0);
        Car car2 = new Car("자동차2","파랑",0);
        car1.upSpeed(30);
        car2.upSpeed(60);
        
    }
}
class Car{
    //자동차의 속성
    String name;
    String color ;
    int currentspeed =0;
    
    //자동차의 기능
    void upSpeed(int s) {
        currentspeed += s;
        System.out.println(name + "의 색상은 " + color + "이며, 현재 속도는 " + currentspeed + "km입니다.");
    }
    
    void downSpeed(int s){
        //현재 속도에서 감소할 속도량만큼 속도를 내리는 코드
        currentspeed -=s;
        System.out.println(name + "의 색상은 " + color + "이며, 현재 속도는 " + currentspeed + "km입니다.");
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getCurrentspeed() {
        return currentspeed;
    }
    public void setCurrentspeed(int currentspeed) {
        this.currentspeed = currentspeed;
    }
    public Car(String n,String c,int s){
        name = n;
        color = c;
        currentspeed = s;
    }
}
