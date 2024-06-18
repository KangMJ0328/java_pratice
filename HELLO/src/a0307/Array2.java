package a0307;

public class Array2 {
    public static void main(String[] args) {
        //배열 변수 선언
        int[] scores;
        //배열 변수에 배열을 대입
        scores = new int[] {83,90,92};
        int sum1 = 0;
        for(int i=0;i<3;i++){
            sum1 += scores[i];
        }
        System.out.println("총합 : " + sum1);

        //배열에 매값을 주고, printItem() 메소드 호출
        printItem(new int[] {83,90,87});
    }
    //printItem() 메소드 선언
    public static void printItem(int[] scores) {
        //매개변수가 참조하는 배열의 항목을 출력
        for(int i = 0 ; i<3 ; i++){
            System.out.println("scores["+i+"]"+scores[i]);
        }

    }
}
