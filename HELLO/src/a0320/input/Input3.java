package a0320.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input3 {
    public static void main(String[] args) throws IOException {
        
        InputStream in = System.in;
        //InputStreamReader 사용하려면 생성자입력으로 InputStream 필요
        InputStreamReader reader = new InputStreamReader(in);
        char[] a = new char[3];
        reader.read(a);
       
        System.out.println(a);  
       
   }
}
