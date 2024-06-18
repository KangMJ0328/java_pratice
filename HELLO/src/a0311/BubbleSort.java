package a0311;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a ={ 3, 5, 1, 2, 4 }; 
        int tempValue, tempJ = 0;
        for(int i=0; i<a.length;i++){ //배열 처음부터 끝가지 반복(i 현재위치)
            int min = Integer.MAX_VALUE; 
            //제일 작은수를 찾기위해, min은 int의 최대값
            for(int j = i; j <a.length; j++){
                if(a[j] < min){//현재위치부터 배열 마지막까지 반복문 돌면서 최소값을 찾음
                    min = a[j]; //작은값을 min에저장
                    tempJ = j; // 작은값이 있는 인데스번호 tempJ 에 저장
                }
              
            }
            tempValue = a[i]; //현재 위치에 있는값은 tempValue 임시저장 
            a[i] = a[tempJ]; //찾은 최소값을 현재위치에 저장
            a[tempJ] = tempValue; // 임시저장된 값을 최소값이 있던 위치로 저장
            // 찾은 최소값과 현재 위치의 값을 교환
        }
        System.out.println(Arrays.toString(a));
    }
}