package a0319.inter1;

public class Interface2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();

        //각 호출의 동작 호출
        dog.eat();
        dog.sleep();

        bird.eat();
        bird.sleep();
        bird.fly(); //Bird 클래스의 특수한 동작인 비행 호출
    }
    
}
//인터페이스 정의
interface Animal{
    // public abstract void eat();
    void eat(); // public abstract가 생략 - 컴파일할 때 자바가 붙여준다.
    void sleep();
}

class Dog implements Animal{

    @Override
    public void eat() {
        System.out.println("개가 먹습니다.");
        
    }

    @Override
    public void sleep() {
       System.out.println("개가 잡니다.");
        
    }
}
class Bird implements Animal{

    @Override
    public void eat() {
        System.out.println("새가 먹습니다.");        
    }

    @Override
    public void sleep() {
        System.out.println("새가 잡니다.");
    }
    public void fly() {
        System.out.println("새가 날아갑니다.");
    }
}