// package a0315.Extends;

// public class Extends3 {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.name = "Bobby";
//         dog.eat(); // Animal클래스의 메소드 
//         dog.bark(); // Animal클래스의 자식인 Dog 클래스의 메소드
        
//         Cat cat = new Cat();
//         cat.name = "Nabi";
//         cat.eat();
//         cat.meow();

//         Owner owner = new Owner();
//         owner.name = "John";
//         owner.talk(); //Person 클래스의 메서드
//         owner.train(dog); // Owner 클래스의 메서드
//     }
    
// }
// //부모클래스
// class Animal{
//     String name;
    
//     void eat(){
//         System.out.println(name + " is eating");
//     }
// }
// //자식 클래스
// class Dog extends Animal{
    
//     void bark(){
//         System.out.println(name + " is barking");
//     }
// }
// class Cat extends Animal{

//     void meow(){
//         System.out.println(name + " is mewoing");
//     }
// }

// //사람 클래스
// class Person{
//     String name;

//     void talk(){
//         System.out.println(name + " is talking");
//     }
// }
// //주인 클래스 (사람을 상속 받음)
// class Owner extends Person{
//     void train(Animal animal){
//         System.out.println(name + " is training " + animal.name);
//     }
//     //'train' 메서드의 매개변수로 'Animal' 타입으로 받고있음 - 업캐스팅
//     //하위클래스의 객체를 -> 상위클래스 타입으로 변환하는 것을 의미

//     //'Owner' 클래스의 'train' 메서드는 'Animal'객체를 받을수 있으며,
//     //Animal의 하위 클래스인 Dog 객체도 포함될 수 있습니다.
// }
