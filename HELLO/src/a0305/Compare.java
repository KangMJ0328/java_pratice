package a0305;

public class Compare {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);

        char char1 = 'A';
        char char2 = 'B';
        boolean result4 = (char1 < char2); //65 <66
        System.out.println("result4: " + result4);

        int num3 = 1;
        double num4 = 1.0;
        boolean result5 = (num3 == num4);
        System.out.println("result5: " + result5);
        
        float num5 = 0.1f; //부동소수점 방식으로 서로 다르다.
        double num6 = 0.1; //
        boolean result6 = (num5 == num6);
        boolean result7 = (num5 == (float)num6);
        System.out.println("result6: " + result6);
        System.out.println("result7: " + result7);

        String str1 = "자바";
        String str2 = "Java";
        boolean result8 = (str1.equals(str2));
        boolean result9 = (!str1.equals(str2));
        System.out.println("result8: " + result8);
        System.out.println("result9: " + result9);
        String str3 = "Java";
        boolean result10 = (str2 == str3);
        System.out.println("result10: " + result10);
        String str4 = new String("Java");
        boolean result11 = (str2 == str4); // 주소값까지 같아야 true
        boolean result12 = (str3.equals(str4)); // 주소안에있는 내용 자체를 비교할때는 .equals()를쓴다.
        
        System.out.println("result11: " + result11);
        System.out.println("str2 주소: " + System.identityHashCode(str2));
        System.out.println("str3 주소: " + System.identityHashCode(str3));
        System.out.println("str4 주소: " + System.identityHashCode(str4));
        System.out.println("result12: " + result12);


    }
    
}
