package a0305;

import java.util.Scanner;
// alt + shift + o 이용해서 import 넣기
public class ex03_2 {
    public static void main(String[] args) {
        //실수 1개 입력
        Scanner sc =new Scanner(System.in);
        System.out.println("실수 한개를 입력하세요");
        float i = sc.nextFloat();
        
        System.out.println("입력한 실수?: " + i);
        System.out.printf("입력한 숫자는 %5.2f\n",i);

        //정수2개 입력받아 출력하기(숫자사이 공백 포함)
        System.out.println("정수 2개 입력하세요");
        String strX = sc.next(); 
        String strY = sc.next();
        int x = Integer.parseInt(strX);
        int y = Integer.parseInt(strY);
        System.out.printf("%d%2d",x,y);

        
        
    }
    
}