package a0319.ab2;

public class MoreKeywords4 {
    public static void main(String[] args) {
        Weapon w1 = new Weapon("장검",1200,10);
        Weapon w2 = new Weapon();
        w1.printInfo();
        w2.printInfo();
    }
    
}


abstract class Itemb{
    protected String name;
    protected int price;


    // public String getName() {
    //     return name;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }
    // public int getPrice() {
    //     return price;
    // }
    // public void setPrice(int price) {
    //     this.price = price;
    // }

    
    public Itemb(String name, int price) { //입력변수가 String, int 생성자
        this.name = name;
        this.price = price;
    }
    Itemb(){ // 입력변수가 없는 생성자
        this.name="이름 없음";
        this.price = -1;
        //위의 입력변수가 String, int 생성자를 호출한다.
    }
}

class Weapon extends Itemb{
    int power; //공격력
    
    Weapon(String name, int price, int power){
        super(name,price);
        this.power = power;
    }

    Weapon() { //입력변수가 없는 부모 생성자를 호출
        super();
        this.power = -1;
    }

    void printInfo(){
        System.out.printf("[%s] 가격: %d 골드, 공격력: %d\n"
        ,super.name,super.price,this.power); //현재 객체의 power필드 
        //부모 영역의 name 필드, 부모 영역의 price 필드
    }
}
//protected
//자식 클래스는 부모의 필드에 직접 접근할 수 있게 한다.