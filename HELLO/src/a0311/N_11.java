package a0311;
import java.util.Arrays;
import java.util.Random;
public class N_11 {
    public static void main(String[] args) {
        // 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 1~10 사이의 난수를 발생시켜 
        // 배열에 초기화한 후 출력하세요.

        // ex.
        // 9 7 6 2 5 10 7 2 9 6
        int[] a = new int[10];
        for(int i=0;i<a.length;i++){
            a[i] =(int)(Math.random()*10)+1;
        }
        System.out.println(Arrays.toString(a));
    }
    
}
