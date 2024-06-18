package a0313;

public class ex08 {
    public static void main(String[] args) {
        Monster orc = new Monster("오크");
        Monster skeleton = new Monster("해골");
        Monster.battle(orc,skeleton);
    }
}
class Monster{
    private String name;
    private int hp;
    private static int maxHp = 30;

    Monster(String s){
        name =s; // Monster 생성자
        hp = maxHp; //몬스터들에게 maxHp값 할당
    }
    public void attack(Monster enemy){
        enemy.hp -=10; // 공격1회당 -10
        System.out.printf("[%s]의 공격-> %s의 체력: %d/%d\n",name,enemy.name,enemy.hp,Monster.maxHp);
    }
    public static void battle(Monster a, Monster b){
        while (a.hp >0 && b.hp >0){
            Monster attacker = (Math.random() <0.5) ? a: b;
            Monster defender = (attacker ==a) ? b: a;
            attacker.attack(defender);
            
        }
    }
}
