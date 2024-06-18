// package a0314.Extends;

// public class RpgTest2 {
//     public static void main(String[] args){
//         Novice novice = new Novice();
//         novice.name = "간달프";
//         novice.hp = 100;
//         novice.punch();
//         Wizard wizard = new Wizard();
//         wizard.name ="간달프1";
//         wizard.hp=100;
//         wizard.mp=80;
//         wizard.punch();
//         wizard.fireball();
//     }
    
// }
// class Novice{
//     String name;
//     int hp;
//     int mp;
//     void punch(){
//         System.out.printf("%s(HP:%d)의 펀치\n",name,hp);
//     }
//     void fireball(){
//         System.out.printf("%s(HP: %d, MP: %d)의 파이어볼~@\n",name,hp,mp);
//     }
// }
// class Wizard extends Novice{
//     int mp;
    
//     void fireball(){
//         System.out.printf("%s(HP: %d, MP: %d)의 파이어볼~@\n",name,hp,mp);
//     }
// }
// //상속이란? 부모클래스의 속성(name,hp)과 메서드(punch)를 자식 클래스가 물려받는것
// //장점 
// //1.코드의 재사용성
// //2.클래스간의 계층구조를 형성하여 객체간의 관계를 명확히 할 수 있다.
