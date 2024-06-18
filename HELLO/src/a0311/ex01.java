package a0311;

public class ex01 {
    public static void main(String[] args) {
        //배열합계 처리하기
        int[] array = {1,2,3,4,5};
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        //배열 'array' 의 각 요소를 순차적으로 변수 num 대입하여 반복하는 구문
        System.out.println("배열의 합계 : " + sum);
    }
    
}
