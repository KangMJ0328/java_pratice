package a0329;

import java.util.Arrays;

public class function3_1 {
    public static void main(String[] args) {
        //50점이상이 점수 총합 
        int[] A = {20, 55, 67, 82, 45, 33, 90, 87, 100, 25};
        int total = Arrays.stream(A).filter((a)-> a >= 50).sum();
        System.out.println(total);
    }

}
