package a0320.exception1;

public class Sample2_2 {
    public static void main(String[] args) {
        int c;
        try{
            c = divideNumbers(4,0);
        }catch(ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
            c = -1;
            //이예외가 발생하면 대체값으로 c변수에 -1로 설정
        }
        System.out.println("결과: " + c);
    }

    private static int divideNumbers(int i, int j) {
       if(j==0){
        throw new ArithmeticException("0으로 나눌 수 없습니다.");
       } // ArithmeticException 클래스의 인스턴스로 생성되며, 
       //생성자에 예외메시지전달 
       return i / j;
       //그렇지 않은 경우는 정상적으로 나눗셈을 수행하고 , 결과반환
    }
}
