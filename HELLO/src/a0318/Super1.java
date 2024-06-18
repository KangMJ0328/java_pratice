package a0318;

public class Super1 {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}

class Parent {
    int num = 10;    
}
class Child extends Parent{

    int num = 20;

    void display(){
        System.out.println("Child class num: " + num); 
        // 자식 클래스의 num 값 출력
        System.out.println("Parent class num: " + super.num);
          // 부모 클래스의 num 값 출력

        //super 키워드를 사용해서 부모 클래스의 'num' 변수에 접근
        //할수있다.   super.num은 부모 클래스의 'num'값을 나타낸다.
    }

}