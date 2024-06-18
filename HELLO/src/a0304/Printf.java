package a0304;

public class Printf {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("상품의 가격:%d원\n",value); //d는 decimal
        System.out.printf("상품의 가격:%6d원\n",value); //전체자리 6글자 우측에 123
        System.out.printf("상품의 가격:%-6d원\n",value); //전체자리 6글자 좌측에 123
        System.out.printf("상품의 가격:%06d원\n",value); //전체자리 6글자 앞에 0으로 채워짐 123
        double area = 3.14159 * 10;
        // 314.159
        System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n",10,area);
        // %10.2f 전체자리수는 10자리에서 2자리 소수점 나타냄(세쨰 자리에서 반올림) 314.16
        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d|%-10s|%10s\n",1,name,job);

    }
    
}
