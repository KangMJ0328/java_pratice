package a0326.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class Stream1 {
    public static void main(String[] args) {
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};

        //ArrayList생성 - 짝수만 포함
        ArrayList<Integer> dataList = new ArrayList<>();
        for(int i = 0; i<data.length;i++){
            if(data[i] %2 == 0){
                dataList.add(data[i]);
            }
        }

        // Set을 사용하여 중복 제거
        HashSet<Integer> dataSet = new HashSet<>();

        //set을 다시 List으로 변경
        ArrayList<Integer> distinctList = new ArrayList<>(dataSet);

        // 역순으로 정렬 
        distinctList.sort(Comparator.reverseOrder());
        // 순방향 Comparator.naturalOrder()

        //Integer 리스트를 정수 배열로 변환
        int[] result = new int[distinctList.size()];
        for(int i = 0; i<distinctList.size();i++){
            result[i] = distinctList.get(i);
        }
        for(int num : result){
            System.out.print(num +" ");
        }
    }
    
}