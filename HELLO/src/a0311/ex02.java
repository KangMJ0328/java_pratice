package a0311;

import java.util.Arrays;

public class ex02 {
    public static void main(String[] args) {
        //배열 뒤집기
        String[] array = {"A","B","C","D","E"};
        for(int i=0;i<array.length /2 ;i++){
            String temp = array[i];
            array[i] = array[array.length-1 - i];
            array[array.length-1 - i] = temp;
        }
        System.out.println("배열 뒤집기 후" + Arrays.toString(array));
    }
    
}
