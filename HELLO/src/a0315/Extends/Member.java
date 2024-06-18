package a0315.Extends;

public class Member extends Object {
    private String name;
    private int age;


    public Member(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Member{ name: "+name+",age: "+age+"}";
    }
    public static void main(String[] args) {
        Member member = new Member("John",30);
        System.out.println(member);
        System.out.println(member.toString());
    }
    
}
