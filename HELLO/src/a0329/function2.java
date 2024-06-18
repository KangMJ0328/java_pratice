package a0329;

import java.util.Arrays;

public class function2 {
    public static void main(String[] args) {
        int[] numbers = {1, -2, 3, -5, 8, -3};
        int[] result = Arrays.stream(numbers) //IntStream을 생성
            .filter((a) -> a>=0) //음수 제거
            .toArray() //int[] 배열로 반환
            ;
        for(int r: result) {
            System.out.println(r);
        }    
    }
}
