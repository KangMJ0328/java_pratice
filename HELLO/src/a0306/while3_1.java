package a0306;

import java.util.Scanner;

public class while3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run =true;
        int speed = 0;
        while(run){
            System.out.println("------------------");
            System.out.println("1.증속 | 2.감속 | 3. 중지");
            System.out.println("------------------");
            System.out.print("선택: ");

            int Num = sc.nextInt();
            sc.nextLine(); // 입력 버퍼 지우기
            if(Num ==1){
                speed++;
                System.out.println("현재 속도 = "+speed);
            }else if(Num ==2){
                speed--;
                System.out.println("현재 속도 = "+speed);
            }else if(Num ==3){
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
    
}
