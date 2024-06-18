package a0318.Super;

import java.util.Random;
public class N_99 {
    public static void main(String[] args) {
        Turtle turtle = new Turtle(); // 거북이 객체 생성

        for (int i = 1; i <= 20; i++) {
            Rabbit rabbit = new Rabbit("토끼 " + i); // 토끼 객체 생성
            rabbit.move(turtle); // 토끼가 거북이를 등에 업고 이동
        }
        
    }
}
class Turtle {
    // 거북이의 이동 메서드
    public void move(int x, int y) {
        System.out.println("거북이가 (" + x + ", " + y + ")로 이동합니다.");
    }
}

class Rabbit {
    private String name;

    // 토끼를 등에 업은 거북이 생성자
    public Rabbit(String n) {
        this.name = n;
    }

    // 토끼가 어디로 이동할지 결정하는 메서드
    public void move(Turtle turtle) {
        Random rand = new Random();
        int x = rand.nextInt(500) - 250; // -250에서 250 사이의 랜덤한 x 좌표
        int y = rand.nextInt(500) - 250; // -250에서 250 사이의 랜덤한 y 좌표
        turtle.move(x, y); // 거북이 이동
        System.out.println(name + "가 거북이를 등에 업고 이동합니다.");
    }
}


