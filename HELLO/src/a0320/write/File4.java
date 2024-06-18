package a0320.write;


import java.io.IOException;
import java.io.PrintWriter;

public class File4 {
    public static void main(String[] args) throws IOException{
        PrintWriter pw = new PrintWriter("c:/abc/out2.txt");
        for(int i=1; i<11 ; i++){
            String data = i + " 번째 줄입니다.";
            pw.println(data);
        }
        pw.close();
    }
}
