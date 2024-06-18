package a0315.Extends;

public class ChildExample {
    public static void main(String[] args) {
        //객체 생성 및 자동 타입 변환
        Parent parent = new Child();
        //Parent 타입으로 필드와 메소드 사용
        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        // parent.field2 = "data2"; 사용 불가
        // parent.method3(); 사용 불가
        // parent는 클래스의 정의된 필드와 메서드만 사용가능
        // child에 정의된 field2와 method3 사용불가

        //강제 타입 변화(다운캐스팅)
        Child child = (Child) parent;
        //child 타입으로 필드와 메소드 사용
        child.field2 = "data2";
        child.method3();
    }
    
}



class Parent{
    //필드 선언
    public String field1;

    //메소드 선언
    public void method1() {
        System.out.println("Parent-method1()");
    }

    //메소드 선언
    public void method2(){
        System.out.println("Parent-method2()");
    }
}

class Child extends Parent{
    public String field2;

    //메소드 선언
    public void method3(){
        System.out.println("Child-method3()");
    }
}