package a0325.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception5 {
    public static void main(String[] args) {
        String str = "abc"; //숫자 형식 예외
        try {
            int number = Integer.parseInt(str); // NumberFormatException 발생
            System.out.println("숫자: " + number);
        } catch (NumberFormatException e) {
            System.out.println("숫자 형식이 아닙니다.");
        }
    }
}
