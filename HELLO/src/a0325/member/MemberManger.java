package a0325.member;

import java.util.ArrayList;

public class MemberManger {
    private ArrayList<Member> members;

    public MemberManger(){ //생성메서드
        members = new ArrayList<>();
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public Member findMember(String name) {
      for(Member member : members){ // members=> ArrayList
        if(member.getName().equals(name)){
            return member;
        }
      }
      return null;
    }

    public void updateMember(String name, int age, String email) {
       Member member = findMember(name);
       if(member !=null){
            member = new Member(name, age, email);
       }else{
            System.out.println("회원을 찾을 수 없습니다.");
       }
    }

    public void deleteMember(String name) {
       Member member = findMember(name);
       if (member != null) {
        members.remove(member);
        } else {
            System.out.println("회원을 찾을 수 없습니다.");
        }
    }

    public void displayAllMembers() {
        if(members.isEmpty()){ //members가 비어있으면
            System.out.println("등록된 회원이 없습니다.");
        }else{
            System.out.println("===등록된 회원 목록===");
            for(Member member : members){
                System.out.println(member);
            }
        }
    }



}
