package a0315.Extends;

public class UpcastingTest {
    public static void main(String[] args) {
        Square s = new Square();
        s.name = "정사각형";
        Triangle t = new Triangle();
        t.name = "삼각형";
        Circle c = new Circle();
        c.name = "원";
        //Shape shape =(Shape) new Square();

        Shape[] shapes = {s,t,c};
        //부모의 타입으로 업 캐스팅 배열 생성
        //하위 클래스 타입의 객체가 상위클래스 타입의 배열 저장이 가능하다.
        //이 과정에서 업캐스팅이 발생한다.
        for (int i = 0; i < shapes.length; i++){
            System.out.printf("%d번 인덱스의 도형: %s\n",i,shapes[i].name);
        }
    }
    
}

//부모 클래스
class Shape {//도형
    String name;
}

// 자식 클래스
class Square extends Shape {} //정사각형

class Triangle extends Shape {} //삼각형

class Circle extends Shape {} //