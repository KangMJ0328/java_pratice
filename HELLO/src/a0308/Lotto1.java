package a0308;

import java.util.Arrays;

public class Lotto1 {
    public static void main(String[] args) {

        // ball 45개의 정수값을 저장하기위한 배열 생성
        // for문으로 배열의 가 요소에 1~45 저장
        // tmp = 0  두값을 바꾸는데 사용하는 임시변수 
        // j = 0  임의의 값을 얻어서 저장할변수

        // 배열 i번쨰 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
        // 0번쨰부터 5번째 요소까지 모두 6개만 바꾼다.
        // j는 0 ~ 44 Math.random()*44 으로 임의의 값을 얻는다.

        //배열 ball 앞에서  6개의 요소를 출력한다.
        int[] ball = new int[45];
        for (int i=0; i<ball.length;i++){
            ball[i] = i+1;
        }

        int tmp = 0;
        int j = 0;

        for(int i =0; i< 6; i++){
            j = (int)(Math.random()*45);
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
            //ball[i] 와 ball[j]의 값을 서로 바꾼다.
            }
        for(int i = 0; i< 6 ; i++){
            System.out.printf("ball[%d] = %d\n", i, ball[i]);
        }


        // int[] ball = new int[6];
        // int tmp = 0 ;
        
        // System.out.println(j);
        // for(int i=0;i<6;i++){
            // int j = (int) (Math.random()*45);
            // ball[i] = j;
        // }
        // System.out.print(Arrays.toString(ball));

    }
}
