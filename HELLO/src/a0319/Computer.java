package a0319;

import java.util.Scanner;

public class Computer {
    public static void main(String[] args) {
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        int hintCount = 0; // 힌트를 요청한 횟수를 저장하는 변수
        int computer = (int) (Math.random() * 100) + 1; // 컴퓨터가 생각하는 한가지의 수

        while (run) {
            int choice = sc.nextInt(); // 사용자가 입력한 수
            hintCount++; // 힌트를 요청한 횟수 증가

            if (choice == computer) {
                System.out.println("정답입니다");
                run = false;
            } else if (choice > computer) {
                System.out.println("임의의 숫자는 " + choice + "보다 작습니다.");
            } else if (choice < computer) {
                System.out.println("임의의 숫자는 " + choice + "보다 큽니다.");
            }

            if (hintCount >= 3) { // 힌트를 세 번 요청했을 때
                System.out.println("힌트를 다 소진하셨습니다.");
                run = false;
            }
         }

    }
}

class LessThan {
    public boolean guess(int guess, int target) {
        return guess < target;
    }
}

class LessThanGameTest {
    public static void main(String[] args) {
        LessThan lessThan = new LessThan();
        int guess = 50; // 사용자가 추측한 숫자
        int target = 75; // 목표 숫자

        if (lessThan.guess(guess, target)) {
            System.out.println("사용자가 추측한 숫자는 목표 숫자보다 작습니다.");
        } else {
            System.out.println("사용자가 추측한 숫자는 목표 숫자보다 크거나 같습니다.");
        }
    }
}
