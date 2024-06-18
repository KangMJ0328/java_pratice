package a0311;



public class ex04 {
    public static void main(String[] args) {
        //2차원 배열 합계 계산하기
        //2차원 정수형 배열이 주어졌을때, 각 행의 합계를 계산하여 결과를 출력하는 프로그램
        //rowSum 
        int[][] matrix = {
            {1,2,3},
            {4,5,6,},
            {7,8,9,}
        };

        for(int i=0;i<matrix.length;i++){
            int rowSum = 0;
            for(int j=0;j<matrix[i].length;j++){
                rowSum += matrix[i][j];
            }
            System.out.println((i+1)+"행의 합계: " + rowSum);
        }
        


    }
    
}
