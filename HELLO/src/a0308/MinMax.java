package a0308;

public class MinMax {
    public static void main(String[] args) {
        int[] score = {79,88,91,33,100,55,95};

        int max = score[0];
        int min = score[0];

        for(int i=1;i<score.length;i++){
            if(max<=score[i]){
                max = score[i];
            }else{
                max = max;
            }
            if(min >=score[i]){
                min = score[i];
            }else{
                min = min;
            }

        }
        System.out.println("최대값 : " +  max + " 최소값 : " + min);


    }
    
}
