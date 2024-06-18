package a0308;

public class N_8 {
    public static void main(String[] args) {
        int[][] array = {
            {95,86},
            {83,92,96},
            {78,83,93,87,88}
        };
        int sum = 0; // 배열안에있는 인덱스 총 갯수
        int result = 0;
        
        for(int i=0;i<array.length;i++){
            sum +=array[i].length;
            // System.out.println(array[i].length);
            for(int j=0;j<array[i].length;j++){
                result += array[i][j];
            }
        }
        System.out.print(result/sum);
    }
    
    }
