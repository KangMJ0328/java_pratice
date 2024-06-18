package a0327.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        /*
      
      * 함수로 만들기
         String student[10][]; 
         ------- 출력예시 -------- 
          1. 학생 정보 추가 (이름, 나이, 영어, 수학)
          2. 학생 정보 삭제 
          3. 학생 정보 검색
          4. 학생 정보 수정
          5. 학생 성적 조회(1명) : 총점
          6. 학생 성적 총점
          7. 학생 성적 평균
          8. 학생 성적순 출력(총점)
          9. 파일로 저장하기(시간 남으면 풀어보세요)
          
          어느 작업을 하시겠습니까 ? >> 
          
       */
//이름 영어 수학 총점 평균 
        Scanner sc = new Scanner(System.in);
        String student[][] =  new String[10][4];
        int dataSize = 0;
        int choice;
        while (dataSize != -1) {
            choice = PrintMain(sc);
            dataSize = selectMenu(choice, student, dataSize, sc);
        }

    }

    
    static int PrintMain(Scanner sc) {
        System.out.println("-----------------------------------");
      System.out.println("1. 학생 정보 추가 (이름, 나이, 영어, 수학)");
      System.out.println("2. 학생 정보 삭제 ");
       System.out.println("3. 학생 정보 검색");
       System.out.println("4. 학생 정보 수정");
       System.out.println("5. 학생 성적 조회(1명) : 총점");
       System.out.println("6. 학생 성적 총점");
       System.out.println("7. 학생 성적 평균");
       System.out.println("8. 학생 성적순 출력(총점)");
       System.out.println("9. 학생데이터 TXT 파일로 저장하기");
       System.out.println("0. 종료");
       System.out.println();
       System.out.print("어느 작업을 하시겠습니까 ? >> ");
       int choice;
       try {
          choice = sc.nextInt();       
      } catch (Exception e) {
         choice = -1;
         sc.nextLine();
      }

        return choice;
    }

 static int selectMenu(int choice, String[][] student, int dataSize, Scanner sc) {
    if(choice == 1) {   
        // 학생추가하기 
        dataSize = addStudent(student, dataSize, sc);
        
    }else if(choice == 2 ) {
        // 학생 정보 삭제
        dataSize = deleteStudent(student, dataSize, sc);
    }else if(choice == 3 ) {
        // 학생정보 검색
        printStudentInfo(student, sc);
    }else if(choice == 4 ) {
        // 학생정보 수정
        update(student, sc);
    }else if(choice == 5 ) {
        // 학생 성적 조회
         printSumOne(student, sc);
    }else if(choice == 6 ) {
        //학생 성적 총점
        printSum(student);
    }else if(choice == 7 ) {
        // 학생 성적 평균 
        printAvg(student, dataSize);
    }else if(choice == 8 ) {
        // 학생성적 출력
        printByGrade(student, dataSize);
    }else if(choice == 9 ) {
        // 파일 출력하기
       setFile(student,dataSize);
       readFile();
    }else if(choice == 0 ) {
        // 종료
        System.out.println("종료합니다.");
        return -1;
    }else {
        System.out.println("잘못된 접근입니다 !");
    }
    
    return dataSize;

}
//이름 영어 수학 총점 평균 
//인덱스 영어 수학 총점 평균
//8. 학생 성적순 출력(총점)
//8-1. 학생 데이터가 있는 배열만 뽑아서 총점과 인덱스를 담는 int 배열만들기
private static double[][] getSum(String[][] student, int dataSize) {
    double[][] studentGradeAll = new double[dataSize][5];
    for(int i = 0; i < student.length; i++){
        try{
            if(student[i][0] !=null){//데이터가 삭제되었거나 없으면 담지 않는다.
                studentGradeAll[i][0] = i;
                studentGradeAll[i][1] = Integer.parseInt(student[i][2]); //영어 
                studentGradeAll[i][2] = Integer.parseInt(student[i][3]); //수학
                studentGradeAll[i][3] = getSumOne(student[i]); // 실제 정렬에 쓰일 비교용 데이터(총점);
                studentGradeAll[i][4] = (studentGradeAll[i][1]+studentGradeAll[i][2])/2; //평균 ->double 안됨 
            }

        }catch(Exception e){// NumberFormatException
            //숫자나 문자가 입력되어있지 않을 경우 예외발생
            studentGradeAll[i][0] = i;
            studentGradeAll[i][1] = -1; 
            studentGradeAll[i][2] = -1; 
            studentGradeAll[i][3] = -1; 
            studentGradeAll[i][4] = -1; 
            //-1을 넣어서 정렬의 맨끝으로 오도록 함
        }
    }
   
    return studentGradeAll;
}

//8-2 학생 성적순으로 저장(출력)하기
 private static double[][] sortByGrade(String[][] student, int dataSize) {
    double[][] studentGradeAll = getSum(student, dataSize);
    double temp[];
    for(int i=0; i < studentGradeAll.length -1 ; i++){
        for(int j = i+1; j < studentGradeAll.length;j++){
          if(studentGradeAll[i][1] < studentGradeAll[j][1]){
            temp = studentGradeAll[i];
            studentGradeAll[i] = studentGradeAll[j];
            studentGradeAll[j] = temp;
          }      
        }
    }

    return studentGradeAll;
}
    //8-3 출력하기
    private static void printByGrade(String[][] student, int dataSize) {
        double[][] studentGradeAll = sortByGrade(student, dataSize);
        for (int i = 0; i < studentGradeAll.length; i++) {
            int index = (int)studentGradeAll[i][0];
            System.out.println((i+1)+"등 : "+student[index][0] + ", 영어: " + (int)studentGradeAll[i][1] + 
            "점, 수학: " + (int)studentGradeAll[i][2] + "점, 총점: " + (int)studentGradeAll[i][3]+"점 평균: " + studentGradeAll[i][4] + "점");
        }
    }

/////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////

private static void setFile(String[][] student,int dataSize) {
    String dirName = "c:/abc";
    String fileName = "studentInfo1.txt";
    File file = new File(dirName+"\\"+fileName);
    try {
        if(!file.exists()) {
            file.createNewFile();
            printFile(file, student,dirName, dataSize);
        }else {
            file.delete();
            file.createNewFile();
            printFile(file, student, dirName, dataSize);
        }
    } catch (Exception e) {
        // null
    }

}


private static void printFile(File file, String[][] student, String dirName, int dataSize) {
    if(checkBeforeWriteFile(file)) {
         FileWriter fWriter = null;
         try {
            fWriter = new FileWriter(file);
         } catch (Exception e) {
         }   
         BufferedWriter bw = new BufferedWriter(fWriter); // 문장으로 모아주는 부분
         PrintWriter pw = new PrintWriter(bw);   // 모아진 문장을 출력해주는 부분()
         
         pw.println(" 이름\t나이\t영어\t수학");
         double[][] studentGradeAll = sortByGrade(student, dataSize);
         for (int i = 0; i < studentGradeAll.length; i++) {
            int index = (int)studentGradeAll[i][0];
            pw.println((i+1)+"등 : "+student[index][0] + ", 영어: " + (int)studentGradeAll[i][1] + 
            "점, 수학: " + (int)studentGradeAll[i][2] + "점, 총점: " + (int)studentGradeAll[i][3]+"점 평균: " + studentGradeAll[i][4] + "점");
        }
        //  for (int i = 0; i < student.length; i++) {
        //     if(student[i][0] != null)
        //     pw.println(student[i][0]+"\t"+student[i][1]+"\t"+student[i][2]+"\t"+student[i][3]);
        //  }
         pw.close();
         System.out.println("< Txt 파일이 " + dirName + "에 저장되었습니다 >");
         
      }else {   // ReadOnly거나 해당 파일이 없는 경우
         System.out.println("파일이 없거나 쓸 수 없습니다.");
      }
}
static boolean checkBeforeWriteFile(File f) {
    if(f.exists()) {   // 파일이 존재함 
        if(f.isFile() && f.canWrite()) {   // 파일이며 쓸수 있는 파일인지 
            return true;
        }
    }
    return false;
    
}
static void readFile()  {
      
      String dirName = "c:/abc";
      String fileName = "studentInfo.txt";
      File file = new File(dirName+"\\"+fileName);
      try {
         
         FileReader fr = new FileReader(file);
         BufferedReader br = new BufferedReader(fr);
         String str;
         try {
            while( (str = br.readLine()) != null){
               System.out.println(str);
            }
         } catch (IOException e) {
            System.out.println("읽을 수 없는 파일입니다.");
         }
      
      } catch (FileNotFoundException e) {
         System.out.println("파일이 없습니다.");
      }
               
   }

   ///////////////////////////////////////////////////////////////////////////////////////////////
   ///////////////////////////////////////////////////////////////////////////////////////////////

//1. 학생 정보 추가
static int addStudent(String[][] student, int dataSize, Scanner sc) {
    if(dataSize > student.length){
        System.out.println("< Fail : 정보를 넣을 공간이 없습니다. >");
        return dataSize;
    }
    System.out.print("이름 : ");
    String name = sc.next();
    System.out.print("나이 : ");
    String age = sc.next();
    System.out.print("영어 : ");
    String eng = sc.next();
    System.out.print("수학 : ");
    String math = sc.next();

    student[dataSize][0] = name;
    student[dataSize][1] = age;
    student[dataSize][2] = eng;
    student[dataSize][3] = math;

    dataSize++;
    return dataSize;
}
//1-1 데이터 사이즈
static int getSize(String[][] student) {
    int nextIndex =0;
    for (int i = 0; i < student.length; i++) {
        if(student[i][0]!= null) {
            nextIndex = i;
            break;
        }
    }
    return nextIndex;
}

private static int deleteStudent(String[][] student, int dataSize, Scanner sc) {
    if(dataSize == 0){
        System.out.println("삭제할 학생이 없습니다.");
      return dataSize;
    }
    System.out.print("삭제할 학생의 이름? :" );
    String name = sc.next();
     for(int i=0; i < student.length;i++){
        try{
            if(student[i][0].equals(name)){
                System.out.println(name + "의 정보가 삭제되었습니다.");
               student[i][0] = null;
               student[i][1] = null;
               student[i][2] = null;
               student[i][3] = null;
               dataSize--;
               return dataSize;
            }
        } catch (Exception e){
            continue;
        }
     }
     System.out.println("<fail : 해당 학생이 없습니다.>");
     return dataSize;
}
//3.학생 정보 검색
private static void printStudentInfo(String[][] student, Scanner sc) {
    System.out.print("검색할 학생의 이름? :" );
    String name = sc.next();
    for (int i = 0; i < student.length; i++) {
        try {
            if(student[i][0].equals(name)) {
                System.out.println("이름 : " + student[i][0]);
                System.out.println("나이 : " + student[i][1]);
                System.out.println("영어 : " + student[i][2]);
                System.out.println("수학 : " + student[i][3]);
                return;
                //메서드 실행이 종료되며, 해당 메서드를 호출한 곳으로 돌아감
            }
        } catch (Exception e) {
            continue;
            //현재 반복문을 중단하고 다음 반복으로 넘어간다.
            //예외가 발생하더라도 다음 반복을 계속 할 수 있다.
        }
    }
    System.out.println("< Fail : 해당 학생이 없습니다 >");
    }

    private static void update(String[][] student, Scanner sc) {

        System.out.print("수정할 학생의 이름? :" );
        String name = sc.next();
        for (int i = 0; i < student.length; i++){
            try {
                if(student[i][0].equals(name)) {
                    System.out.println(name+" 학생의 정보 수정 ");
               System.out.print("영어 : ");
               String eng = sc.next();
               System.out.print("수학 : ");
               String math = sc.next();
                    student[i][2] = eng;
                    student[i][3] = math;
                    return;
                }
            } catch (Exception e) {
                continue;
            }
        }
    }
//5. 학생 성적 조회(1명)
    private static void printSumOne(String[][] student, Scanner sc) {
        System.out.println("< 성적 조회 >");
        System.out.print("조회할 학생의 이름? :" );
        String name = sc.next();
        for(int i=0; i<student.length;i++){
           try{
                if(student[i][0].equals(name)){
                    int sum = 0;
                    sum = getSumOne(student[i]);
                    double avg = getavgOne(student[i]);
                    if(sum==-1){
                        System.out.println(name+"의 성적정보가 잘못됐습니다.");
                    }else{
                        System.out.print(name + "학생의 총점 : " + sum + "점\n");
                        System.out.printf(name + "학생의 평균 : %.2f점",avg );
                        System.out.println();
                    }
                    return;

                }

           }catch(NullPointerException e){
                continue;
           }     

        }
        System.out.println("< fail : 해당 학생정보가 없습니다.");
    }

   

    //5-1. 각사람의 점수 합계 구하기
    static int getSumOne(String[] student) {
        int sum = 0;
        try{
            sum = sum + Integer.parseInt(student[2]);
            sum = sum + Integer.parseInt(student[3]);
        }catch(Exception e){
            sum = -1;
        }
        return sum;
    }
    
    private static double getavgOne(String[] student) {
        double avg = 0;
        int sum = getSumOne(student);

        if(sum ==-1){
            avg = -1;
        }else{
            avg = sum / 2.0;
        }
        return avg;
    }


    //학생들 총점
    private static void printSum(String[][] student) {
        System.out.println("< 학생들의 총점 : " + getSumAll(student)+"점 >");
      System.out.println("< 영어 총점 : "+getSumEng(student)+"점 >");
      System.out.println("< 수학 총점 : "+getSumMath(student)+"점 >");
    
    }


     static int getSumAll(String[][] student) {
        int sumAll=0;
      int sumEng=0;
      int sumMath=0;
        sumEng = getSumEng(student);
      sumMath = getSumMath(student);
         
      sumAll = sumEng+sumMath;
      return sumAll;

    }


    private static int getSumEng(String[][] student) {
        int sumEng = 0;
        for(int i=0; i < student.length; i++){
            try{
                if(student[i][0] != null){
                    sumEng += Integer.parseInt(student[i][2]);
                }
            }catch(Exception e){
                System.out.println(" < Fail : 성적을 숫자로 수정하세요 >");
            System.out.println(" < "+student[i][0]+" 학생 영어 정보의 오류>" );
            continue;
            }
        }
        return sumEng;
    }
    
    private static int getSumMath(String[][] student) {
        int sumMath = 0;
        for(int i=0; i < student.length; i++){
            try{
                if(student[i][0] != null){
                    sumMath += Integer.parseInt(student[i][3]);
                }
            }catch(Exception e){
                System.out.println(" < Fail : 성적을 숫자로 수정하세요 >");
            System.out.println(" < "+student[i][0]+" 학생 수학 정보의 오류>" );
            continue;
            }
        }
        return sumMath;
    }

    //7. 학생 성적 평균
    static double getAverageSum(String[][] student, int dataSize) {
        double avg = getSumAll(student);
        avg /= dataSize;
        return avg;
    }

    static double getAverageEng(String[][] student, int dataSize) {
        double avg = getSumEng(student);
        avg /= dataSize;
        return avg;
    }

    static double getAverageMath(String[][] student, int dataSize) {
        double avg = getSumMath(student);
        avg /= dataSize;
        return avg;
    }

    //7.학생성적평균
    private static void printAvg(String[][] student, int dataSize) {
        System.out.println("< 학생들의 평균 : " + getAverageSum(student, dataSize)+"점 >");
        System.out.println("< 영어 평균 : " + getAverageEng(student, dataSize)+"점 >");
        System.out.println("< 수학 평균 : " + getAverageMath(student, dataSize)+"점 >");
    }
}


