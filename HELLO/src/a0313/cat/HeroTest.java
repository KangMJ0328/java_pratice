package a0313.cat;

public class HeroTest {
    public static void main(String[] args) {
        // 두 Hero 객체를 만들기와 동시에 생성자 호출
        Hero ironMan = new Hero("아이언맨",100,100);
        Hero hulk = new Hero("헐크",200,80);

        //생성자 정보 출력
        System.out.println(ironMan.toStr());
        System.out.println(hulk.toStr());
    }
    
}
//한개의 파일에 public은 하나
class Hero{
    String name; //이름
    int power; //힘
    int speed; //속도
    //Hero(){} - 기본 생성자
    Hero(String name,int power,int speed){
        this.name = name;
        this.power = power;
        this.speed = speed;
    }

    //객체 정보를 문자열로 변환
    String toStr(){
        return String.format("Hero{name :%s,power :%d,speed :%d}"
        ,name,power,speed);
    }
}
