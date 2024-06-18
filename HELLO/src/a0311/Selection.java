package a0311;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] a = {3,5,1,2,4};
        int tempValue, tempJ = 0;
        for(int i=0;i<a.length;i++){
            int min = Integer.MAX_VALUE;
            // max는 int의 최대값
            for(int j =i;j<a.length;j++){
                if(a[j] < min){
                    min = a[j];
                    tempJ = j;
                }
                tempValue = a[i]; //현재 위치에 있는값은 tempValue에 임시저장
                a[i] = a[tempJ]; //찾은 최소값을 현재위치에 저장
                a[tempJ] = tempValue; // 임시저장된 값을 최소값이 있던 위치로 저장
                // 찾은 최소값과 현재 위치의 값을 교환

            }
            
        }System.out.println(Arrays.toString(a));
    }
    
}
