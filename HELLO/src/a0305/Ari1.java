package a0305;

public class Ari1 {
    public static void main(String[] args) {
        
        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10L;
        int result1 = v1 + v2; // 모든 피연산자는 int 타입으로 자동변환

        long result2 = v1 + v2 -v4;
        // 모든 피연산자는 long 타입으로 자동변환
        System.out.println("result2: " + result2);

        double result3 = v1 / (double)v2;
        System.out.println("result3: " + result3);


    }
    
}
