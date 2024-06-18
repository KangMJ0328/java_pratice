package a0318.Super;

public class Super2 {
    public static void main(String[] args) {
        Child child = new Child(20);
        child.display();
    }
}

class Parent {
    int num;
    Parent(int num){
        this.num = num;
    }    
    void display() {
        System.out.println("Parent class num: " + num);
    }
}
class Child extends Parent{

   Child(int num){
        super(num);
   }
   // Child 클래스에서 super()를 사용하여 부모클래스의 생성자를
   //호출하고, 자식클래스에서 부모 클래스의 생성자에 인수를 전달
   void display() {
    System.out.println("Child class num: " + num);
    super.display();
    }
}