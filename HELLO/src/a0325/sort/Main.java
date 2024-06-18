package a0325.sort;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        TreeSet<Student> hs = new TreeSet<>();
        FileInputStream fls = new FileInputStream("c:/abc/score.txt");
        Scanner sc = new Scanner(fls);

        while(sc.hasNext()){
            String line = sc.nextLine();
            String[] strArr = line.split(" "); //공란을 기준으로 배열을 만듬
            hs.add(new Student(strArr[0],Integer.parseInt(strArr[1]),Integer.parseInt(strArr[2]),Integer.parseInt(strArr[3])));
        }
        for(Student e : hs){
            System.out.println("이름 : " + e.getName());
            System.out.println("총점 : " + e.getTotalScore());
            System.out.println("==============================");
        }
    }
}
