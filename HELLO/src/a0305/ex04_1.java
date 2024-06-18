package a0305;

import java.util.Scanner;
// alt + shift + o 이용해서 import 넣기
public class ex04_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // String a = sc.next();3.12

        // String b = sc.next();
        // System.out.println(b+" "+a);

        //실수 입력받아 소수점 둘째자리까지 출력하기

        float c = sc.nextFloat();
        System.out.printf("%3.2f",c);
        
        
    }
    
}