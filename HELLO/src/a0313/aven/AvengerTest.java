package a0313.aven;

public class AvengerTest {
    public static void main(String[] args) {
        Avenger thor = new Avenger("토르",150);
        Avenger thanos = new Avenger("타노스",160);
        thor.punch(thanos);
        thanos.punch(thor);
    }
    
}
class Avenger{
    String name;
    int hp;

    Avenger(String s,int i){
        name = s;
        hp = i;
    }
    void punch(Avenger enemy){
        System.out.printf("[%s]의 펀치!",name);
        enemy.hp -=10;
        System.out.printf("-> %s의 체력 : %d\n",enemy.name,enemy.hp);
    }
    //메소드에 객체도 전달할 수 있다.
}