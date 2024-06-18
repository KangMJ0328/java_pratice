package a0320.write;


import java.io.FileWriter;
import java.io.IOException;

public class File3_1 {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("c:/abc/out4.txt");
        for(int i=1; i<11 ; i++){
            String data = i + " 번째 줄입니다.\r\n";
            fw.write(data);
        }
        fw.close();
        //파일내용 추가하기
        FileWriter fw2 = new FileWriter("c:/abc/out4.txt",true);//추가모드로 연다
        for(int i=11; i<21 ; i++){
            String data = i + " 번째 줄입니다.\r\n";
            fw2.write(data);
        }
        fw2.close();
    }
}
