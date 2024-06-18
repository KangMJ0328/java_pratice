package a0307;

import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        // 정수 3개를 입력 받아 가장 큰 수를 구하시오.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a);
        }else if(b>a && b>c){
            System.out.println(b);
        }else if(c>a && c>b){
            System.out.println(c);
        }
    }
    
}
