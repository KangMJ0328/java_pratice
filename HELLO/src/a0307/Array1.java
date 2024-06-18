package a0307;

public class Array1 {
    public static void main(String[] args) {
        String[] season ={"Spring","Summer","Fall","Winter"};
        //String season[] 이렇게 선언해도됨
        //배열은 같은 타입의 값만 관리한다.
        //배열의 길이는 늘리거나 줄일수없다.

        //배열의 항목값 읽기
        System.out.println("season[0] : " + season[0]);
        System.out.println("season[1] : " + season[1]);
        System.out.println("season[2] : " + season[2]);
        System.out.println("season[3] : " + season[3]);
        
        //인덱스1번 항목의 값 변경
        season[1] = "여름";
        System.out.println("season[1] : " + season[1]);
        System.out.println();
        
        //배열 변수 선언과 배열 생성
        int[] scores = {83,90,87};
        //총합과 평균 구하기
        int sum = 0;
        for(int i=0;i<3; i++){
            sum += scores[i];
        }
        System.out.println(sum);
        double avg = (double) sum/3;
        System.out.println(avg);
    }
}
