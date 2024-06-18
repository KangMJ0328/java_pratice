package a0322.Map;
import java.util.*;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,Member> memberMap = new HashMap<>();
        
        // Member 객체생성 및 맵에 추가
        Member member1 = new Member(1,"John");
        Member member2 = new Member(2,"Alice");
        Member member3 = new Member(3,"Bob");

        memberMap.put(member1.getId(), member1);
        memberMap.put(member2.getId(), member2);
        memberMap.put(member3.getId(), member3);

        // 맵에서 멤버를 검색
        int memberIdToFind = 2;
        Member foundMember = memberMap.get(memberIdToFind);
        if(foundMember != null){
            System.out.println("찾는 Id " +memberIdToFind + ": " + foundMember.getName() );
        }else{
            System.out.println("찾는 사람이 없어요");
        }
        // 맵 순회
        System.out.println("\nMembers in the map:");
        for(Map.Entry<Integer, Member> entry: memberMap.entrySet()){
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue().getName());
        }
        // Map.Entry<Integer, Member> 맵의 항목을 나타내는 인터페이스 Map.Entry의 
        // 제네릭 타입 key-value 쌍을 표현하는데 사용
        // Integer는 key타입 Member는 값(value)의 타입으로 나타냅니다.
        
    }
    
}
class Member{
    private int id;
    private String name;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
