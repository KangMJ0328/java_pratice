package a0308;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a={3,5,1,2,4};
        int tempValue, tempJ = 0;
        // 배열 처음부터 끝까지 반복 (i는 현재 위치)
        for(int i = 0; i< a.length ; i++){
            int min = Integer.MAX_VALUE; 
            // 제일 작은수를 찾기위해 - 가장 큰 정수값 2,147,483
            for(int j = i;j<a.length;j++){
                if(a[j] < min){
                    // 현재위치부터 마지막까지 반복문돌면서 최소값을 찾음
                    min = a[j];
                    tempJ = j;
                }
            }
            tempValue = a[i]; // 찾은 최소값과 현재 위치의 값과 교환
            a[i] = a[tempJ];
            a[tempJ] = tempValue;

        }
        System.out.println(Arrays.toString(a));
    }    
}
