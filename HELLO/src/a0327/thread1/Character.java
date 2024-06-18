package a0327.thread1;

public class Character extends Unit implements GameAction{

    // 생성장의 매개변수로 전달 받은 값으로 캐릭터의 기본 능력치를 설정

    public Character(String name, int pP, int mP, double pH, double mH, int ultra, int hp){
        this.name = name;
        pPower = pP;
        mPower = mP;
        pHit = pH;
        mHit = mH;
        ultraPower = ultra;
        this.hp = hp;
    }


    @Override
    public double mAttack() { // 마법 공격력
        return mPower * mHit;
    }

    @Override
    public double pAttack() { // 물리 공격력
        return pPower * pHit;
    }

    @Override
    public boolean setDamage(double damage) {
        if(hp > damage){
            hp -= damage;
            System.out.println("남아있는 " + name + "의 체력은 " + hp + "입니다.");
            return false;
        }else{
            System.out.println(name + "이(가) 죽었습니다. 게임을 종료합니다.");
            return true;
        }
        
    }

    @Override
    public int ultimate() { // 궁극기
        return ultraPower;
    }
    
}
