package a0313.aven;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person();

        //유효성 검사를 통한 값 설정
        person.setname("John");
        person.setage(25);
        
        //유효하지 않는 값 설정
        // person1.setname("");
        // person1.setage(-5);

        System.out.println("이름: " + person.getname());
        System.out.println("나이: " + person.getage());

    }
    
}
class Person{
    private String name;
    private int age;

    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    //setter 메소드 - 유효성 검사
    public void setname(String name){
        // 이름이 null이 아니고 비어있지않는 경우에만 설정
        if(name != null && !name.trim().isEmpty()){
            this.name = name;
        }else{
            System.out.println("유효하지 않는 이름입니다.");
        }
    }
    public void setage(int age){
        //나이가 0이상인경우에만 설정
        if(age >= 0){
            this.age = age;
        }else{
            System.out.println("유효하지 않는 나이입니다.");
        }
    }
}