package a0315.Extends;

public class Extends2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Bobby";
        dog.eat(); // Animal클래스의 메소드 
        dog.bark(); // Animal클래스의 자식인 Dog 클래스의 메소드
        
        Cat cat = new Cat();
        cat.name = "Nabi";
        cat.eat();
        cat.meow();

    }
}
//부모클래스
class Animal{
    String name;
    
    void eat(){
        System.out.println(name + " is eating");
    }
}
//자식 클래스
class Dog extends Animal{
    
    void bark(){
        System.out.println(name + " is barking");
    }
}
class Cat extends Animal{

    void meow(){
        System.out.println(name + " is mewoing");
    }
}