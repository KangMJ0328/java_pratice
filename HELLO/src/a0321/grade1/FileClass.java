package a0321.grade1;

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
        public FileClass(String dir, String fileName){
            file = new File("c:\\"+dir+"\\"+fileName+".txt");
            this.dir = "c:\\" + dir;
		    this.fileName = fileName +".txt";
        }
        // 파일명이 있는지 확인하기
        public boolean check(File file) {
            if(file.exists()) {
                return true; 
            }
                return false;
        }
        //create
        public void create() throws Exception{
            boolean exist = check(file);
            if(exist){
                file.delete();
                file.createNewFile();

            }else{
                file = new File(dir);//c:/ezen
                file.mkdirs(); //폴더만들기
                file = new File(dir+"\\" + fileName); //c:/ezen/studentGrade.txt
                file.createNewFile();
            }

        }
        //write
        public void write(String str) throws Exception{
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(str);
            fw.close();
		
	    }
        //read
        public void read() throws Exception{
            boolean exist = check(file);
            if(exist){
                FileReader fr = new FileReader(file);
                BufferedReader bw = new BufferedReader(fr);
                String str;
                while((str=bw.readLine())!=null){
                    System.out.println(str);
                }
            }else{
                System.out.println("읽을 파일이 없습니다.");
            }
        }

}
