package a0305;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        // 세 자리 정수를 입력받아 각 자리의 숫자를 역순으로 출력하는 프로그램을 작성하세요.
        // 예: 입력이 123일 경우, 출력은 321을 출력.

        Scanner sc = new Scanner(System.in);
        System.out.println("세자리 정수를 입력: ");
        int num = sc.nextInt();
        int length = (int)(Math.log10(num)+1);
        int result = 0;
            for(var i=0; i<length; i++){
                int l =num % 10 ; 
                result = result * 10 + l;
                num /= 10;
            }
            System.out.println(result);
    }



    
}
