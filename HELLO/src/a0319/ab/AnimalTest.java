package a0319.ab;

public class AnimalTest {
    public static void main(String[] args) {
       // Animal animal = new Animal(); 
       //추상클래스는 직접 객체를 만들수 없다.
       //자식 객체생성을 위해 개념적으로 분리된 부모 클래스일뿐이다.
        Tiger t = new Tiger();
        Lion l = new Lion();
        Dog d = new Dog();
        Cat c = new Cat();
        Animal[] animals = {t,l,d,c};
        for(int i = 0; i<animals.length;i++){
            animals[i].cry();
        }
    }
}
//추상 클래스란 직접 객체를 생성할 수는 없지만 
//상속을 위해 정의된 개념적 클래스로 , abstract 키워드를 통해 선언 

abstract class Animal {
    String name;

    void cry(){
        System.out.println("동물이 웁니다");
    }
}
class Tiger extends Animal{
    void cry(){
        System.out.println("어흥");
    }
}
class Lion extends Animal{
    void cry(){
        System.out.println("크아아");
    }
}
class Dog extends Animal{
    void cry(){
        System.out.println("멍멍");
    }
    }
class Cat extends Animal{
    void cry(){
        System.out.println("야옹");
    }
}
