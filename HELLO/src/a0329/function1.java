package a0329;

public class function1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int count = 0;      
        // 홀수 개수를 세기
        for (int num : numbers) {
            if (num % 2 == 1) {
                count++;
            }
        }        
        // 홀수를 두 배로 곱하여 새로운 배열 생성
        int[] result = new int[count];
        int index = 0;
        for (int num : numbers) {
            if (num % 2 == 1) {
                result[index] = num * 2;
                index++;
            }
        }        
        // 결과 출력
        for (int r : result) {
            System.out.println(r);
        }
    }
}
