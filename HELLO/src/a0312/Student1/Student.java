package a0312.Student1;

public class Student {
    public String name; //이름
    public int age; //나이
    public String major; //전공



    // public Student(){} 눈에 보이진 않으나 기본생성자가 만들어진다.
   
    public Student(String name, int age,String major){
        this.name = name;
        this.age = age;
        this.major = major;
    }
    //정보출력 메서드
    public void displayInfo(){
        System.out.println("학생이름: " +name);
        System.out.println("나이: " +age+"세");
        System.out.println("전공: " +major);
        System.out.println();
    }
    
}
