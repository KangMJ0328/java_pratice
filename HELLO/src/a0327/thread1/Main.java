package a0327.thread1;

import java.util.Scanner;

// 멀티스레드를 이용하여 캐릭터가 죽을때까지 실행하는 프로그램 만들기!
// 캐릭터는 전사 (warrior)와 마법사(wizard)를 만들겠습니다.
// 능력치는 객체생성할 때 설정

// 설계 내용
// - 상속과 인터페이스 적용
// - 스레드 동작확인
// - 게임 캐릭터를 생성하고 스레드를 통해 실시간 전투 진행


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("강력한 체력과 물리 공격력의 전사 이름을 정하세요 : ");
        String warriorName = sc.next();
        System.out.print("궁극의 마법 능력을 지닌 마법사 이름을 정하세요 : ");
        String wizardName = sc.next();
        
        Character warrior = new Character(warriorName, 8, 2, 0.8, 0.5, 40, 500);
        Character wizard = new Character(wizardName, 2, 28, 0.5, 0.9, 100, 250);
        GameThread1 gameThread1 = new GameThread1(warrior, wizard);
        GameThread2 gameThread2 = new GameThread2(warrior, wizard);

        gameThread1.start();
        gameThread2.start();
    }
    
}
