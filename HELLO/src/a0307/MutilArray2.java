package a0307;

public class MutilArray2 {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3];


        //배열 항목 값 변경
        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;

        //전체 학생의 수학 평균 구하기

        int totalStudent = 0;
        int totalMathSum = 0;
        for(int i =0; i<mathScores.length; i++){
            totalStudent += mathScores[i].length;
            for( int k = 0; k <mathScores[i].length;k++){
                totalMathSum += mathScores[i][k];
            }
        }
        double totalMathAvg = (double) totalMathSum / totalStudent;
        System.out.println("전체 학생의 수학 평균 점수 : "+ totalMathAvg);
    }
    
}
