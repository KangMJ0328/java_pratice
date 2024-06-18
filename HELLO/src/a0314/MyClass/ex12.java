// package a0314.MyClass;

// public class ex12 {
//     //필드
//     // 생성자
//     // 메소드
//     public static void main(String[] args) {
//         Member user1 = new Member("홍길동","hong");
//         MemberService memberService = new MemberService();
//         boolean result = memberService.login("hong","12345");
//         if(result){
//             System.out.println("로그인 되었습니다.");
//             memberService.logout("hong");
//         }else{
//             System.out.println("id 또는 password가 올바르지 않습니다.");
//         }
//     }

// }
// class Member{
//     private String name;
//     private String id;
//     private String password;
//     private int age;

//     Member(String n,String i){
//         name = n;
//         id = i;
//     }
    
// }
// class MemberService{
//     boolean login(String i,String p){
//         if(i.equals("hong")&&p.equals("12345")){
            
//             return true;
//         }else{
            
//             return false;
//         }
//     }
//     void logout(String id){
//         System.out.println(id+"님이 로그아웃 되었습니다.");
//     }
// }



