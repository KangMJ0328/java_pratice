package a0327.thread1;
// 스레드 생성 , 전사 캐릭터에 대한 구현부
public class GameThread1 extends Thread{
    private Character warrior;
    private Character wizard;

    public GameThread1(Character warrior, Character wizard ){
        this.warrior = warrior;
        this.wizard = wizard;
    }
    @Override
    public void run(){
        int normal; // 일반 공격에 대한 확률 구하기
        int special; // 특수 공격에 대한 확률 구하기
        boolean endGame = false; // 게임에 대한 종료 여부

        while (true){
            try{
                sleep(3000); // 3초 마다 반복
                normal = (int) (Math.random()*2); // 50% 확률 
                special = (int) (Math.random() * 20); // 5% 확률
                if(normal == 1){
                    System.out.println("물리공격 : " + wizard.name + "에게 " + warrior.pAttack() + "데미지를 입혔습니다.");
                    endGame = wizard.setDamage(warrior.pAttack());
                }else{
                    System.out.println("마법공격 : " + wizard.name + "에게 " + warrior.mAttack() + "데미지를 입혔습니다.");
                    endGame = wizard.setDamage(warrior.mAttack());   
                }
                if(special == 10){
                    System.out.println(warrior.name + " 궁극기 발동!!!" + wizard.name + "에게 " + warrior.ultimate() + "데미지를 입혔습니다.");
                    endGame = wizard.setDamage(warrior.ultimate());
                }
                if(endGame){
                    System.exit(0);
                }
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
