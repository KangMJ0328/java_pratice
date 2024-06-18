package a0329;

import java.util.Scanner;

public class function5 {
    public static void main(String[] args) {
        // 숫자 문자열을 받아 총합을 구하는 프로그램을 작성하시오
        // 숫자 문자열을 정수로 바꿀때는 Integer.parseInt(문자열사용)
        //예시 ) 입력해 주세요 : 65,45,2,3,45,8
        // 예시 출력) 총합 : 168 입니다.
        //1. 사용자로부터 한줄을 입력받는다.
        //2. , 로 구분된걸 배열로 바꿔서 저장(split) - 사용
        //3.for문으로  trim() 으로 숫자의 문자의 공백제게
        //4.  Integer.parseInt 로 숫자문자를 정수로 변환
        //5. 다 더해서 총합구하기
        //6. 인쇄

        Scanner sc = new Scanner(System.in);
        System.out.println("입력해주세요");
        String userInput = sc.nextLine();  // 사용자로부터 한 줄 입력을 받는다.
        String[] numbers = userInput.split(",");//"," 구분자로 나눈다.
        int total =0;
        for(String num : numbers){
            num = num.trim(); // 수자 문자의 공백을 제거한다.
            int n = Integer.parseInt(num); //숫자 문자를 정수로 변환한다.
            total += n;
        }
        System.out.printf("총합은 %d 입니다.\n ",total);
    }
}
