package a0313.aven;

public class ex6_3 {
    public static void main(String[] args) {
        System.out.println("Card.width = "+Card.width);
        System.out.println("Card.height = "+Card.height);
        //클래스 변수(static(정적)변수)는 객체 생성없이 
        //'클래스이름.클래스변수'로 직접 사용가능하다.

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;
        System.out.println("c1은 " + c1.kind +", "+ c1.number+"이며, 크기는 ("+c1.width+", " + c1.height +")");
        System.out.println("c2은 " + c2.kind +", "+ c2.number+"이며, 크기는 ("+c2.width+", " + c2.height +")");

        c1.width = 50;
        c1.height = 80;

        System.out.println("c1은 " + c1.kind +", "+ c1.number+"이며, 크기는 ("+c1.width+", " + c1.height +")");
        System.out.println("c2은 " + c2.kind +", "+ c2.number+"이며, 크기는 ("+c2.width+", " + c2.height +")");


    }
}
class Card{
    String kind; // 카드의 종류
    int number; //카드의 숫자
    static int width = 100;
    static int height = 150;
//1. 인스턴스 변수(일반변수 - 멤버변수)
//클래스 영역에 선언, 인스턴스를 생성(개체생성시) 만들어진다.
//인스턴스 변수(iv)의 값을 읽어 오거나 저장하려면 먼저 인스턴스를 생성해야함
//인스턴스마다 별도의 공간을 가지므로 서로다른 값을 가질수있다.
// kind , number에 해당

//2. 클래스변수(공용변수,정적변수,static)
// 선언방법 - 인스턴스 변수앞에 static을 붙이기만 하면 된다.
// 클래스변수는 모든 인스턴스가 공통된 저장곤간을 공유
//객체 생성하지 않아도 사용가능 '클래스이름.클래스 변수' ex)Card.width;

//3. 지역변수 - 메서드 내에 선언, 메서드 내에서만 사용가능 
// for문 while문은 블럭 내에서 선언된 지역변수는, 
// 지역변수가 선언된 블럭{}내에서만 사용가능, 블럭{}을 벗어나면 소멸


}
