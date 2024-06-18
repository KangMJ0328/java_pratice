package a0311;

import java.util.Arrays;

public class ex06 {
    public static void main(String[] args) {
        //길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
        int[] a = new int[10];
        int num = a.length;
        for(int i=0;i<a.length;i++){
            a[i] = num;
            num--;
            
            
        }
        System.out.println(Arrays.toString(a));
    }
    
}
