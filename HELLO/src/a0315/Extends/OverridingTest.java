package a0315.Extends;

public class OverridingTest {
    public static void main(String[] args) {
        Archer a = new Archer();
        Archer ma = (Archer) new MasterArcher(); // 업 캐스팅
        a.shoot();
        ma.shoot();
    }
    
}
class Archer{
    void shoot(){
        System.out.println("[아처]의 활 공격이 10만큼의 피해를 주었다.");
    }
}
class MasterArcher extends Archer{
    @Override //생략가능
    void shoot(){
        System.out.println("[마스터아처]의 활 공격이 30만큼의 피해를 주었다.");
    }
}