package a0312.Student1;

public class St1Exemple {
    public static void main(String[] args) {
        
       Student student1 = new Student("문동은" , 20, "컴퓨터공학");
       Student student2 = new Student("이석현" , 22, "수학과");
       Student student3 = new Student("임동식" , 21, "부동산학과");

       //생성한 객체의 정보 출력
       System.out.println("====학생 정보 ====");
       student1.displayInfo(); 
       student2.displayInfo(); 
       student3.displayInfo(); 
    }
}