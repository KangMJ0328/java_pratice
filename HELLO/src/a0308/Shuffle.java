package a0308;

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
        // System.out.println(numArr[(int)(Math.random()*11)+1]);
        System.out.println(Arrays.toString(numArr));
        // 배열의 내용을 문자열로 변환하여 반환하는 메소드
        for(int i=0;i<100;i++){
            // numArr[i] = numArr[(int)(Math.random()*10)];
            int n = (int)(Math.random()*10); //0~9중 한 값을 임의로 얻는다.
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
            

        }
        System.out.println(Arrays.toString(numArr));
    }
    
}
