package a0325.HomeWork;

public class ExceptionError {
// 1. Exception(예외):
// Exception은 프로그램 실행 중에 발생할 수 있는 예외 상황을 나타냅니다.
// Exception 클래스를 상속받는 모든 예외는 Throwable 클래스를 상속받습니다.

// 예외는 두 가지 유형으로 나뉩니다:

// Checked Exception(검사 예외): 컴파일러가 강제로 예외 처리를 요구하는 예외입니다. 코드에서 명시적으로 처리되지 않으면 컴파일 오류가 발생합니다. 
// 대표적으로 IOException, SQLException 등이 있습니다.

// Unchecked Exception(Runtime Exception)(비검사 예외): 컴파일러가 예외 처리를 강제하지 않는 예외입니다. 실행 시 발생할 수 있는 예외입니다. 
// 대표적으로 NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException 등이 있습니다.


// 2. Error(에러):
// Error는 프로그램이 복구할 수 없는 심각한 문제를 나타냅니다. 주로 시스템 레벨에서 발생합니다.
// Error 클래스를 상속받는 예외는 시스템이나 애플리케이션에서 처리할 수 없는 예외입니다.
// 주로 가상 머신이나 하드웨어의 문제로 인해 발생하며, 프로그래머가 직접 처리할 필요가 없습니다.
// 대표적인 예로는 OutOfMemoryError, StackOverflowError, InternalError 등이 있습니다.
    
}
