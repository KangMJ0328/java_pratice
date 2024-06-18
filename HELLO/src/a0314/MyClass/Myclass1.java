package a0314.MyClass;

public class Myclass1 {
    public static void main(String[] args) {
        Myclass obj1 = new Myclass(10); //생성자 호출
        obj1.myMethod();
        Myclass obj2 = new Myclass();
        obj2.myMethod();
    }
}
class Myclass{
    int myVariable;

    //생성자
    public Myclass(int myVariable){
        //여기서의 this는 해당 객체를 가리킵니다.
        this.myVariable = myVariable;
    }
    public Myclass(){
        // 여기서의 this는 int myVariable를 부릅니다.
        this(0); // 0으로 매개변수를 전달하여 다른 생성자 호출
    }
    public void myMethod() {
    //여기서 this는 해당 객체를 가리킵니다.
        System.out.println("My variable value is "+this.myVariable);
    }
}

// 'this'와 'this()'는 각각 객체의 참조와 생성자 호출
// this.myVariable 객체의 필드를 가리키고있으며
// this()는 다른 생성자를 호출하는데 사용한다.