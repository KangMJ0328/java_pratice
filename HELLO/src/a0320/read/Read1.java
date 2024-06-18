package a0320.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read1 {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new FileReader("c:/abc/out5.txt"));
      while (true) {
        String line = br.readLine();
        if(line==null) break;
        System.out.println(line);
      }  
      br.close();
    }
}
