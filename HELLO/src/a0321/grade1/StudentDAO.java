package a0321.grade1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDAO {
    
    Scanner sc = new Scanner(System.in);
    private ArrayList<StudentDTO> slist;
    private FileClass file = new FileClass("ezen","studentGrade");

    // id,  name,  age,  kor,  eng,  math
    public  StudentDAO() {
        slist = new ArrayList<StudentDTO>();
        // 기본데이터
		StudentDTO s1 = new StudentDTO(0,"테스트1",11,100,90,80);
		StudentDTO s2 = new StudentDTO(1,"테스트2",22,90,89,91);
		StudentDTO s3 = new StudentDTO(2,"테스트3",33,85,77,55);
		StudentDTO s4 = new StudentDTO(3,"테스트4",44,77,68,85);

        slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);

    }
    private void insert(StudentDTO s) {
       slist.add(s);
    }

    private void delete(int index) {
       slist.remove(index);
    }

    private StudentDTO select(int index) {
       return slist.get(index);
    }
    private void update(int index, StudentDTO s) {
        slist.set(index, s);
    }




    private int searchIndex() {
        int index =-1;
        System.out.println("학생의 이름을 입력하세요");
        System.out.print(">>");
        String name = sc.next();
        for(int i=0;i < slist.size();i++){
            if(slist.get(i).getName().equals(name)){
                index = i;
                break;
            }
        }
        return index;
    }


    public void userInsert() {
        StudentDTO s = new StudentDTO();
        s.setId(slist.size()-1);
        System.out.println("< 학생 추가하기 > ");
        System.out.print("이름 : ");
        s.setName(sc.next());
        System.out.print("나이 : ");
        s.setAge(sc.nextInt());
        System.out.print("국어점수 : ");
        s.setKor(sc.nextInt());
        System.out.print("영어점수 : ");
        s.setEng(sc.nextInt());
        System.out.print("수학점수 : ");
        s.setMath(sc.nextInt());

        insert(s);
        System.out.println("학생이 추가되었습니다.");
    }
    public void userDelete() {
       System.out.println("<학생정보 삭제> ");
       int index = searchIndex();
       if(index == -1){
        System.out.println("찾는 학생이 없습니다.");
       }else{
           String name =  slist.get(index).getName();
           delete(index);
           System.out.println(name+" 학생정보를 삭제했습니다.");
       } 

    }
    public void userSelect() {
       System.out.println("< 학생정보 보기 >");
       int index =  searchIndex();
       if(index == -1){
            System.out.println("찾는 학생이 없습니다.");
        }else{
            System.out.println(" 이름\t        나이\t 국어\t 영어 \t수학\t평균\n"
                        +"------------------------------------------------------");
            StudentDTO s = select(index);
            System.out.println(s);
        }
        
    }
    public void userUpdate() {
        System.out.println("< 학생정보 수정 >");
        int index =  searchIndex();
        if(index==-1){
            System.out.println("찾는 학생이 없습니다.");
        }else{
            StudentDTO s = new StudentDTO();
            s.setId(slist.get(index).getId());
            s.setName(slist.get(index).getName());
			s.setAge(slist.get(index).getAge());
            System.out.println("<"+slist.get(index).getName()+"학생의 정보수정");
            System.out.print("국어점수 : ");
			s.setKor(sc.nextInt());
			System.out.print("영어점수 : ");
			s.setEng(sc.nextInt());
			System.out.print("수학점수 : ");
			s.setMath(sc.nextInt());
            update(index, s);
        }
    }
    public void printAll() {
        System.out.println(" 이름\t           나이\t 국어\t 영어 \t수학\n"
				+ "------------------------------------------------");
        for(int i =0; i <slist.size();i++){
            System.out.println(slist.get(i).toString());
        }        
        
    }

   //file

   public void dataSave() throws Exception{
        file.create();
        String str = " 이름\t 나이\t 국어\t 영어\t 수학\t평균\n"
        + "----------------------------------------------------------\n";
        for(int i = 0; i < slist.size();i++){
            str += slist.get(i).toString()+"\n";
        }
        file.write(str);
        System.out.println("데이터를 저장했습니다.");
   }
   public void dataLoad() {
    try {
        file.read();
    } catch (Exception e) {
        System.out.println("읽을 파일이 없습니다.");
    }

    
    }


    public int getTotalScore() {
        int index = searchIndex();
        if (index == -1) {
            System.out.println("찾는 학생이 없습니다.");
            return 0; 
        } else {
            return slist.get(index).getTotal();
        }
    }
    
    public void getAverageScore() {
        int total = getTotalScore(); 
        total = total / 3; 
        System.out.println("학생 평균점수: "+ total);
    }
    
   //문제 StudentDTO
   // 필드 추가
   // getTotalscore() 메서드를 만든다.
   // getAverageScore() 메서드를 만들어 
   // getTotalscore() /3으로 나눈 



}
