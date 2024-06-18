package a0325.HomeWork;

public class AbstractVSInterface {
//     추상 클래스는 상속을 통해 기본 구현을 제공하고, 다양한 동작을 구현하는 데 사용됩니다. 하위 클래스들이 공통된 기능을 가질 때 추상 클래스를 사용할 수 있습니다.
//     인터페이스는 클래스 간의 관계를 정의하고, 다중 상속이 필요한 경우에 사용됩니다. 특히 다른 클래스들과 상관 없이 객체가 특정 동작을 보장해야 할 때 인터페이스를 사용할 수 있습니다.
    public static void main(String[] args) {
        //추상메서드
        Animal dog = new Dog("Buddy");
        dog.makeSound(); // "Buddy says Woof"
        dog.sleep();     // "Buddy is sleeping"


        //인터페이스
        Animal1 dog1 = new Dog1();
        dog1.makeSound(); // "Dog says Woof"
        dog1.sleep();     // "Animal is sleeping"
    }
}
// 추상 클래스(Abstract class):
// 추상 클래스는 하나 이상의 추상 메서드(abstract method)를 포함하는 클래스입니다. 추상 메서드는 선언만 되어 있고 구현이 없는 메서드입니다.
// 추상 클래스는 객체를 직접 생성할 수 없으며, 반드시 이를 상속한 하위 클래스에서 추상 메서드를 구현해야 합니다.
// 추상 클래스는 일반 메서드와 멤버 변수를 포함할 수 있으며, 일반적인 클래스와 동일하게 동작할 수 있습니다.
// 추상 클래스는 상속(inheritance)을 통해 확장되어야 하며, 다중 상속을 지원하지 않습니다.
// 추상 클래스는 상속을 통해 기본 구현을 제공하고, 하위 클래스에서 필요에 따라 메서드를 오버라이드하여 수정할 수 있습니다.

abstract class Animal {
    String name;

    // 추상 메서드
    abstract void makeSound();

    // 일반 메서드
    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class Dog extends Animal {
    Dog(String name) {
        this.name = name;
    }

    // 추상 메서드 구현
    void makeSound() {
        System.out.println(name + " says Woof");
    }
}

// 인터페이스(Interface):
// 인터페이스는 추상 메서드와 상수(constant)만을 포함하는 특별한 형태의 추상 클래스입니다. 메서드는 선언만 되어 있으며, 구현이 없습니다.
// 클래스가 인터페이스를 구현(implement)할 때는 인터페이스에 선언된 모든 메서드를 반드시 구현해야 합니다.
// 인터페이스는 다중 상속을 지원합니다. 클래스가 여러 인터페이스를 구현할 수 있습니다.
// 인터페이스는 다른 클래스와의 관계를 정의하는 데 사용됩니다. 클래스가 특정 인터페이스를 구현함으로써 해당 인터페이스의 규약(Contract)을 따르는 것을 보장합니다.
// 자바 8부터는 인터페이스에서도 디폴트(default) 메서드와 정적(static) 메서드를 제공할 수 있게 되었습니다. 이를 통해 인터페이스 내에서 일부 기본 구현을 제공할 수 있게 되었습니다.

interface Animal1 {
    // 추상 메서드
    void makeSound();

    // 디폴트 메서드
    default void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog1 implements Animal1 {
    // 인터페이스의 추상 메서드 구현
    public void makeSound() {
        System.out.println("Dog says Woof");
    }
}
