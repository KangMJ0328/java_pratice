package a0320.Hak1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        //학생을 저장할 ArrayList생성
        boolean condition = true;
        while(condition){
            System.out.println("1. 학생 등록");
            System.out.println("2. 성적 입력");
            System.out.println("3. 성적 출력");
            System.out.println("4. 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기
            switch (choice) {
                case 1:
                    System.out.print("이름입력: ");    
                    String name = scanner.nextLine();
                    System.out.print("학번입력: ");    
                    String studentId = scanner.nextLine();
                    Student student = new Student(name, studentId);
                    students.add(student);
                    // for(Student s : students){
                    //     System.out.println(s);
                    // }
                    System.out.println("학생 등록 완료!");
                    break;
                case 2:
                    System.out.println("=== 성적 입력 ===");
                    System.out.print("학번 입력: ");
                    String id = scanner.nextLine();  
                    Student foundStudent= findStudentById(students, id);    
                    if(foundStudent !=null){
                        System.out.print("성적 입력: ");
                        int grade = scanner.nextInt();
                        foundStudent.setGrade(grade); 
                        System.out.println("성적 입력 완료");
                    }else{
                        System.out.println("해당 학번을 가진 학생이 없습니다.");
                    } 
                    break;
                case 3:
                    System.out.println("===성적 출력===");
                    // for(Student s : students){
                    //     System.out.println(s);
                    // } 
                    for(int i=0;i < students.size();i++){
                       Student s = students.get(i);
                       //System.out.println(s);
                       System.out.println("이름: "+ s.getName() +", 학번: "+s.getStudentId()+", 성적: "+s.getGrade());
                    }
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다."); 
                    scanner.close();
                    condition = false; 
                    System.exit(0); //프로그램 즉시종료 
                    //return - 메소드 종료        
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요");
                    break;
            }

        }

    }

    private static Student findStudentById(ArrayList<Student> students, String id) {
        for(Student s : students){
            if(s.getStudentId().equals(id)){
                return s;
            }
        }
        return null;
    }
}

class Student{
    private String name;
    private String studentId;
    private int grade;
    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;      
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    // @Override
    // public String toString() {
    //     return "이름 : "+ name +", 학번: "+ studentId +", 성적 : "+ grade ;
    // }

}