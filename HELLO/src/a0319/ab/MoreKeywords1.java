package a0319.ab;

public class MoreKeywords1 {
    public static void main(String[] args) {
        Itema item1 = new Itema();
        System.out.printf("[%s] (%d 골드) 생성완료\n",item1.name,item1.price);
    }
    
}


class Itema{
    String name;
    int price;
    public Itema(String name, int price) {
        this.name = name;
        this.price = price;
    }
    Itema(){ // 입력변수가 없는 생성자
        this("이름 없음", -1);
    }
}