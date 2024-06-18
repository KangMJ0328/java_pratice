package a0329;

import java.util.ArrayList;
import java.util.Arrays;

public class Exception2 {
     public static void main(String[] args) {
        int result = 0;
        try {
            int[] a = {1, 2, 3};
            int b = a[3];  // ArrayIndexOutOfBoundsException 발생
            ArrayList c = new ArrayList(Arrays.asList("3"));
            int d = (int) c.get(0);  // ClassCastException 발생
            int e = 4 / 0;  // ArithmeticException 발생
        } catch (ArrayIndexOutOfBoundsException e) {
            result += 3;
        } catch (ClassCastException e) {
            result += 1;
        } catch (ArithmeticException e) {
            result += 3;
        } finally {  // 예외에 상관없이 항상 수행된다.
            result += 4;
        }
        System.out.println(result); // 7 출력
     }
}

//가장먼저 ArrayIndexOutOfBoundsException 가 발생했기 때문에 
//int b = a[3]; 이후의 문장은 수행되지않는다.