package a0315;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();   
        int n = 10;
        System.out.printf("임의의 정수: %d\n",random.nextInt());
        System.out.printf("0 이상 N(%d) 미만의 임의 정수: %d\n",n,random.nextInt(n));
        System.out.printf("임의의 정수: %f\n",random.nextDouble());
    }
    
}
