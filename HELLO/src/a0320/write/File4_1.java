package a0320.write;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class File4_1 {
    public static void main(String[] args) throws IOException{
        PrintWriter pw = new PrintWriter("c:/abc/out5.txt");
        for(int i=1; i<11 ; i++){
            String data = i + " 번째 줄입니다.";
            pw.println(data);
        }
        pw.close();

        PrintWriter pw2 = new PrintWriter(new FileWriter("c:/abc/out5.txt",true));
        for(int i=10; i<21 ; i++){
            String data = i + " 번째 줄입니다.";
            pw2.println(data);
        }
        pw2.close();
    }
}
// PrintWriter를 사용할 경우에는 생성자의 파라미터로 파일명 대신 
//추가모드로 열린 FileWriter의 객체를 전달해야 한다.

