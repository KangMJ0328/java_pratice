package a0314.Extends;

public class RpgTest {
    public static void main(String[] args){
        Novice novice = new Novice();
        novice.name = "간달프";
        novice.hp = 100;
        novice.punch();
        Wizard wizard = new Wizard();
        wizard.name ="간달프1";
        wizard.hp=100;
        wizard.mp=80;
        wizard.punch();
        wizard.fireball();
    }
    
}
class Novice{
    String name;
    int hp;
    int mp;
    void punch(){
        System.out.printf("%s(HP:%d)의 펀치\n",name,hp);
    }
    void fireball(){
        System.out.printf("%s(HP: %d, MP: %d)의 파이어볼~@\n",name,hp,mp);
    }
}
class Wizard{
    String name;
    int hp;
    int mp;
    void punch(){
        System.out.printf("%s(HP:%d)의 펀치\n",name,hp);
    }
    void fireball(){
        System.out.printf("%s(HP: %d, MP: %d)의 파이어볼~@\n",name,hp,mp);
    }
}
