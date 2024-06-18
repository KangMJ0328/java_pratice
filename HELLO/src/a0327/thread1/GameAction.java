package a0327.thread1;

public interface GameAction {
    double pAttack(); // 물리공격력
    double mAttack(); // 마법 공격력
    int ultimate(); // 궁극기 공격력
    boolean setDamage(double damage); //받는 피해량
}
