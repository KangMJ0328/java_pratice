package a0329;

import java.util.Arrays;

public class function1_1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] result = Arrays.stream(numbers)  //IntStream 생성
            .filter((a) -> a % 2 == 1 ) //홀수만 취합한다.
            .map((a) -> a *2)  //각 항목에 2를 곱한다.
            .toArray()  //int[] 배열로 반환
            ;
        for(int r: result) {
            System.out.println(r);
        }   
    }
}
