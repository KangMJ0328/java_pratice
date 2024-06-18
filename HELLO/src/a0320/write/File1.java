package a0320.write;

import java.io.FileOutputStream;
import java.io.IOException;

public class File1 {
    public static void main(String[] args) throws IOException{
        FileOutputStream output = new FileOutputStream("c:/abc/out.txt");
        output.close();
    }
}
