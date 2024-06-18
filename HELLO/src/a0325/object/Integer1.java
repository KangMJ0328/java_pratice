package a0325.object;

public class Integer1 {
    public static void main(String[] args) {
        int num = 10;
        Integer integerNum = Integer.valueOf(num);
        int convertedNum = integerNum.intValue(); 

        System.out.println("Binary: " + Integer.toBinaryString(num)); 
        System.out.println("Max Value: " + Integer.MAX_VALUE);
        System.out.println("Min Value: " + Integer.MIN_VALUE);
    }
}
// 1. 컬렉션 프레임 워크에서는 기본 데이터 타입이 아닌 객체만 다룰수 있음
//2. 메서드의 메개변수로 객체를 요구할 때 - Wrapper 클래스를 사용하여 객체로 변환전달