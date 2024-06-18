package a0311;

import java.util.Arrays;
import java.util.Scanner;

public class N_10 {
    public static void main(String[] args) {
        // 주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
        // 단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.

        // ex.
        // 주민등록번호(-포함) : 123456-1234567
        // 123456-1******
        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록번호(-포함) 입력: ");
        String number = sc.nextLine();
        char[] arr = new char[number.length()];
        for (int i = 0; i < number.length(); i++) {       
            arr[i] = number.charAt(i);        
        }
        char[] newnumber = new char[arr.length];
        for( int i =0;i<arr.length;i++){
            newnumber[i] = arr[i];
        }
        for( int i =8;i<arr.length;i++){
            newnumber[i] = '*';
        }
        String result =new String(newnumber);
        System.out.println(result);
        




    }
    
}
