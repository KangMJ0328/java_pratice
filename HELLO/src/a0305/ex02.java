package a0305;

import java.util.Scanner;
// alt + shift + o 이용해서 import 넣기
public class ex02 {
    public static void main(String[] args) {
        //키보드
        //정수형으로 변수 선언하고, 변수에 값을 저장한후
        //변수에 저장된값 그대로 출력하기
        Scanner sc =new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int i = sc.nextInt(); //한글자의 숫자를 읽어들여 i저장
        System.out.print("입력한 정수는?: " + i);
    }
    
}