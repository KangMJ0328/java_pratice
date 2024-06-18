package a0311;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a ={3,5,1,2,4};
        int tempValue,target;
        for(int i=1;i<a.length;i++){
            tempValue = a[i]; //선택된 숫자를 임시저장.
            target = i -1;
            while(target >=0 && a[target] > tempValue){
                a[target+1]=a[target]; //나보다 큰 수는 오른쪽으로 한칸이동
                target--;
            }
            a[target+1] = tempValue; // 적정한 위치를 찾아 선택된 숫자를 삽입

        }
        System.out.println(Arrays.toString(a));


    }
    
}
