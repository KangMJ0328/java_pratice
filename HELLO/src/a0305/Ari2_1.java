package a0305;

import java.text.DecimalFormat;

public class Ari2_1 {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        // double result = apple - number * pieceUnit;
        double result = apple - number * pieceUnit;
        // int resultInt = (int)Math.round(result);

        DecimalFormat df = new DecimalFormat("0.0");
        String formattedValue = df.format(result);
        System.out.println("Formatted Value: " + formattedValue);
        // System.out.println("10조각에서 남은조각: "+resultInt);

        //부동소숫점 방식으로 실수 형이 계산되서 정확한 답이 안나옴.
        //정확한 계산을 하려면 정수형으로 만든다.
    }
    
}
