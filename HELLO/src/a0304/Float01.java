package a0304;

public class Float01 {
    public static void main(String[] args) {
        float var1 = 0.1234567890123456789f;
		double var2 = 0.1234567890123456789; 
        //더블타입이 float타입보다 2배 정도의 유효숫자를 가리킴

        System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
        //10의 거듭제곱 리터럴
        double var3 = 3e6;
        float var4 = 3e6f;
        double var5 = 2e-3;
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
    }
}

