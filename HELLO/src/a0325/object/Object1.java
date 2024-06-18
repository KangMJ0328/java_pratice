package a0325.object;

import java.util.Objects;

public class Object1 {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);
        Person person3 = new Person("Alice", 30);

        System.out.println("person1.toString(): " + person1.toString());
        //System.out.println("person2.toString(): " + person2.toString());
        //System.out.println("person3.toString(): " + person3.toString());
        // Override 하지 않으면 클래스명@해쉬코드
        
        System.out.println("person1.equals(person2): " + person1.equals(person2));
        System.out.println("person1.equals(person3): " + person1.equals(person3));

    }
}
class  Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }

    @Override
    public boolean equals(Object obj){ //조상이 person3를 매개변수로 받음
       // if(this == obj) return true;
       // if(obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);        
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}  
//Object 클래스는 자바의 최상위 클래스

//1. toString() : 객체를 문자열로 표현 하는데 사용 - 오버라이드하여 
// 해당 객체의 내용을 원하는 형식으로 문자열로 반환

// 2. equals(Object obj) : 객체의 동등성을 비교하는 데 사용
// 메서드를 오버라이드하여 두 객체가 같은지를 비교하는 논리를 구현할 수 있습니다.
//3. hashCode(): 객체의 해시 코드를 반환합니다.  -오버라이드하여 동일한 객체에 대해
//동일한 해시코드를 반환
//getClass : 객체의 클래스를 반환
//4. clone : 객체를 복제 - 이 메서드를 사용하려면 Cloneable 인터페이스를 구현


