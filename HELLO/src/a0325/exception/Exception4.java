package a0325.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception4 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("not_found.txt")); // FileNotFoundException 발생
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        }
    }
}
