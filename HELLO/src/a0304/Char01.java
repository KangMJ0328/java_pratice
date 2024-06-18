package a0304;

public class Char01 {
    public static void main(String[] args) {
        //하나의 문자를 작은 따옴표에 감싼것을 리터럴이라고 한다.
        //문자리터럴은 유니코드로 변환되어 저장된다.
        //유니코드는 세계 각국문자를 0~ 65535 숫자로 매핑한 국제표준규약
        char c1 = 'A'; //문자 저장
        char c2 = 65; //유니코드 직접 저장
        char c3 = '가'; //문자 저장
        char c4 = 44032;  //유니코드 직접 저장
        System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
    }
}
