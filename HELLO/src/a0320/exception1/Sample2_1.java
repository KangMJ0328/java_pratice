package a0320.exception1;

public class Sample2_1 {
    public static void main(String[] args) {
        int c;
        try{
            c = 4 / 0; // ArithmeticException 발생
        }catch(ArithmeticException e){
            c = -1;
            //이예외가 발생하면 대체값으로 c변수에 -1로 설정
        }
        System.out.println("결과: " + c);
    }
}
