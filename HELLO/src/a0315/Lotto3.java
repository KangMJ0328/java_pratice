package a0315;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lotto3 {
    public static void main(String[] args) {
        ArrayList<Integer> lottoMachine =new ArrayList<Integer>();
        for(int i = 1; i <=45; i++){
            lottoMachine.add(i); // 모든 로또 번호 (1~45)를 ArrayList
        }
        Collections.shuffle(lottoMachine);
        for(int e : lottoMachine){
            System.out.print(e + " ");
        }
        System.out.println();
        int [] lottoNumArr = new int[6];
        for(int i = 0; i < lottoNumArr.length; i++){
            lottoNumArr[i] = lottoMachine.remove(0);
        }
        String lottoNumStr = Arrays.toString(lottoNumArr);
        System.out.printf("자동 로또 번호 생성 : %s",lottoNumStr);
        System.out.println();
        for(int e : lottoMachine){
            System.out.print(e + " ");
        }
    }
    
}
