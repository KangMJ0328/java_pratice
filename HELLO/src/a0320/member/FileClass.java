package a0320.member;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileClass {

    private File file;
    private String dir;
	private String fileName;

    public FileClass(){
        file = new File("c:\\");
    }

    public FileClass( String dir, String fileName) {
        file = new File("c:\\"+dir+"\\"+ fileName+".txt"); // c:/sun/memberInfo.txt
        this.dir = "c:\\" + dir; //c:/sun
        this.fileName = fileName + ".txt"; //memberInfo.txt
    }
    //파일명이 있는지 확인
    public boolean check(File file){
        if(file.exists()){
            return true;
        }else{
            return false;
        }
    }
    //
    public void create() throws Exception{
        boolean exist = check(file);
        if(exist){//파일이 존재하면 - c:/sun/memberInfo.txt
            file.delete();  // 파일을 지우고 
            file.createNewFile(); //새로운 파일 생성
        }else{
            file = new File(dir); //디렉토리명을 넣고  - sun 
            System.out.println(dir);
            file.mkdir(); //디렉토리생성 -c:/sun
            file = new File(dir + "\\" + fileName); //- c:/sun/memberInfo.txt
            //생성된 디렉토리에밑에 파일명을 넣고
            file.createNewFile();
            //새로운 파일을 넣는다.		
            //c:\\sun\\memberInfo.txt 만든다.
        }

    } 
    
    public void read() throws Exception{
        boolean exist = check(file);
        if(exist) {
            FileReader fr = new FileReader(file);
            BufferedReader bw = new BufferedReader(fr);
            String str;
            while((str = bw.readLine()) != null ){
                System.out.println(str);
            }
            bw.close();
        }else {
            System.out.println("읽을 파일이 없습니다.");
        }
		
	}
	
	
	// write 
	
	public void write(String str) throws Exception{
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(str); // PrintWriter를 사용하여 주언지 문자열(str)을 파일에 씁니다.
		fw.close();
		
	}
       
}
