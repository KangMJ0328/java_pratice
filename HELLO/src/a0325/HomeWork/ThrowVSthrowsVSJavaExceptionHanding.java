package a0325.HomeWork;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class ThrowVSthrowsVSJavaExceptionHanding {
//     1. throw:
// throw는 예외를 발생시키는 데 사용됩니다. 
// 특정 조건에서 프로그램이 예외적인 상황에 직면했을 때, 해당 예외를 명시적으로 발생시키고 싶을 때 사용됩니다. 
// 보통 개발자가 직접 예외를 발생시키기 위해 사용됩니다.

// 2.throws
// throws 키워드는 메서드 선언에서 예외를 던질 수 있는 것을 명시하는 데 사용됩니다.
//  이 키워드는 메서드의 시그니처 뒤에 위치하며, 메서드가 해당 예외를 던진다는 것을 나타냅니다.
//  메서드를 호출하는 쪽에서 이 예외를 처리하도록 요구합니다.

// 3.Java Exception Handling (예외 처리)
// Java에서 예외 처리는 try, catch, finally, throw, throws 등의 키워드를 사용하여 구현됩니다.



}
 // throw 예제
class ThrowExample {
    public static void main(String[] args) {
        int age = -5;
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        System.out.println("Age is: " + age);
    }
}
// 이 예제에서는 나이가 음수일 경우 IllegalArgumentException을 발생시킵니다. throw 키워드를 사용하여 명시적으로 예외를 발생시키고 있습니다.

// throws 예제

class ThrowsExample {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader file = new FileReader("file.txt");
    }
}
// 이 예제에서는 FileReader 객체를 생성할 때 FileNotFoundException이 발생할 수 있습니다.
//  이 예외를 호출한 메서드에게 처리를 위임하기 위해 main 메서드에 throws FileNotFoundException을 추가했습니다.

// Java Exception Handling (예외 처리) 예제
class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        } finally {
            System.out.println("Finally block executed");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
// 이 예제에서는 divide 메서드에서 0으로 나누려고 시도하면 ArithmeticException이 발생합니다.
//  이 예외를 try-catch 블록으로 처리하고 있으며, finally 블록은 예외 발생 여부와 상관없이 항상 실행됩니다