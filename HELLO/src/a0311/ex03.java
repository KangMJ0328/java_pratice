package a0311;

import java.util.Arrays;

public class ex03 {
    public static void main(String[] args) {
        //중복요소찾기
        int[] array = {1,2,3,4,2,5};
        boolean hasDuplicates = false;
        Arrays.sort(array);
        int temp = 0;
        // System.out.println(Arrays.toString(array));
        for(int i=0;i<array.length -1 ;i++){
            if(array[i] == array[i+1]){
                hasDuplicates = true;
                temp = array[i];
                break;
            }

        }
        System.out.println("배열의 중복된요소가있는가? " + hasDuplicates+"\n중복된값: "+temp);

    }
    
}
