package a0325.HomeWork;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class finally_block {
    // finally 블록은 Java의 예외 처리 메커니즘에서 중요한 역할을 하는 블록입니다.
    // try-catch 블록 다음에 사용되며, try 블록이 끝난 후 항상 실행됩니다. 
    // finally 블록은 예외가 발생하더라도 실행되며, 예외가 발생하지 않는 경우에도 실행됩니다.

}
class FinallyExample {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("file.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close(); // 파일 리더 닫기
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}
// 위의 예제에서는 파일을 읽는 동안 예외가 발생할 수 있습니다. 
// try 블록에서 파일을 열고 읽는 동안 발생할 수 있는 IOException을 처리하고, finally 블록에서는 BufferedReader 객체를 닫아 리소스를 해제하고 있습니다. 
// 이렇게 하면 파일 리소스가 항상 제대로 해제되어 메모리 누수를 방지할 수 있습니다