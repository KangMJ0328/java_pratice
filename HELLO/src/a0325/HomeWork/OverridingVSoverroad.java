package a0325.HomeWork;

public class OverridingVSoverroad {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display(); // "부모 클래스의 display 메서드"

        Child child = new Child();
        child.display(); // "자식 클래스의 display 메서드"
        child.display("Hello"); // "오버로딩된 display 메서드: Hello"
    }
}

class Parent {
    void display() {
        System.out.println("부모 클래스의 display 메서드");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("자식 클래스의 display 메서드");
    }

    // 오버로딩
    void display(String message) {
        System.out.println("오버로딩된 display 메서드: " + message);
    }
}