package a0320.exception1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new FileReader("나없는파일"));
        br.readLine();
        br.close();
    }
}
//이코드를 실행하면 존재하진 않는 파일을 열려고 시도했기 때문데
// 파일을 찾을 수 없다는 FileNotFoundException라는 예외발생