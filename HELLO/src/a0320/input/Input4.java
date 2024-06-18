package a0320.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Input4 {
    public static void main(String[] args) throws IOException {
        
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        String a = br.readLine();
        System.out.println(a);  
       
   }
}
// InputStream: byte를 읽는다.
// InputStreamReader: character(문자)를 읽는다.
// BufferedReader: String(문자열)을 읽는다.