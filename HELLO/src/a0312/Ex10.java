package a0312;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
// 주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
// 단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.

// ex.
// 주민등록번호(-포함) : 123456-1234567
// 123456-1******
        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록번호(-포함):");
        String num = sc.nextLine();

        char[] arr = new char[14];
        for(int i=0; i<num.length();i++){
            arr[i] = num.charAt(i);
        }
       char[] copy = arr.clone();
       //System.out.println(Arrays.toString(copy));
       for(int i=8;i<copy.length;i++){
        copy[i] = '*';
       }
       System.out.println(copy);
       sc.close();

    }
}
