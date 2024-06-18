package a0319.inter2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        boolean condition = true;
        while(condition) {
            System.out.println("1. 학생 등록");
            System.out.println("2. 학생 목록 출력");
            System.out.println("3. 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); //버퍼 비우기
            // nextInt() 나 nextDouble() 등의 숫자를 입력받는 메서드를 
            // 호출한 후에 nextLine()을 호출하면 숫자를 입력받는 과정에서 
            // 입력버퍼에 개해문자('\n')가 남아있다. - 오류인식
            // 따라서 nextLine()을 호출하여 입력 버퍼 내용을 비워줌.

            switch (choice) {
                case 1:
                    System.out.print("이름 입력: ");
                    String name = scanner.nextLine();
                    System.out.print("학번 입력: ");
                    String studentId = scanner.nextLine();
                    System.out.print("전공 입력: ");
                    String major = scanner.nextLine();

                    Student student = new Student(name, studentId, major);
                    students.add(student);
                    System.out.println("학생 등록 완료");
                    break;
                case 2:
                    System.out.println("===== 학생 목록 =====");
                    // for(Student s : students){ // Student s 에 students를 넣는다.
                    //     System.out.println(s); // s.toString()이 생략되있다.
                    // }

                    // 위와 동일

                    for( int i = 0; i<students.size(); i++){
                        Student s = students.get(i);
                        System.out.println(s);
                    }
                    
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    condition = false;
                    // System.exit(0); //프로그램을 종료해라
                    // // 자바가상머신(JVM을 종료하므로 프로그램의 실행이 완전히 중지)
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                    break;
            }

        }
    }
    
}

class Student{
    private String name;
    private String studentId;
    private String major;
    
    public Student(String name, String studentId, String major) {
        this.name = name;
        this.studentId = studentId;
        this.major = major;
    }
    @Override
    public String toString(){
        return "이름: " + name + ", 학번: " + studentId + ", 전공: " + major ;
    }
    
}