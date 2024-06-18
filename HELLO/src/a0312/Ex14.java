package a0312;

public class Ex14 {
    public static void main(String[] args) {
        // 로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 
        // 오름차순으로 정렬하여 출력하세요.
        //숙제 버블 정렬로 정렬하시오
     int[] lotto = new int[6];
     for(int i = 0; i<lotto.length;i++){
        lotto[i]  = (int)(Math.random()*45 + 1);
        
        for(int j = 0; j < i; j++) {
            if(lotto[i] == lotto[j]) {
                i--;
                break;
            }
        }
     }   
     for(int i=0; i < lotto.length;i++){
        System.out.print(lotto[i]+ " ");
     }
     System.out.println();
     int temp = 0;
     for(int i=0; i < lotto.length;i++){
        for(int j = i; j < lotto.length;j++){
            if(lotto[i] > lotto[j]){
                temp = lotto[i];
                lotto[i] = lotto[j];
                lotto[j] = temp;
            }

        }

     }

     for(int i=0; i < lotto.length;i++){
        System.out.print(lotto[i]+ " ");
     }

    }
}
