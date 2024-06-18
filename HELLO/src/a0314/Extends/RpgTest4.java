// package a0314.Extends;

// public class RpgTest4 {
//     public static void main(String[] args){
//         Novice novice = new Novice();
//         novice.name = "간달프";
//         novice.hp = 100;
//         novice.speed = 1; // speed 변수를 설정하는 부분
//         novice.punch();
//         novice.move();
        
//         Wizard wizard = new Wizard();
//         wizard.name ="간달프1";
//         wizard.hp=100;
//         wizard.mp=80;
//         wizard.speed = 2; // speed 변수를 설정하는 부분
//         wizard.punch();
//         wizard.fireball();
//         wizard.move();
        
//         Knight knight = new Knight();
//         knight.name ="킹아서";
//         knight.hp = 150;
//         knight.stamina =70;
//         knight.speed = 3; // speed 변수를 설정하는 부분
//         knight.punch();
//         knight.slash();
//         knight.move();
//     }
// }

// class Novice{
//     String name;
//     int hp;
//     int speed; // speed 변수 추가
    
//     void punch(){
//         System.out.printf("%s(HP:%d)의 펀치\n",name,hp);
//     }
    
//     void move(){
//         System.out.printf("%d만큼 이동합니다.\n",speed); // speed 필드 사용
//     }
// }

// class Wizard extends Novice{
//     int mp;
    
//     void fireball(){
//         System.out.printf("%s(HP: %d, MP: %d)의 파이어볼~@\n",name,hp,mp);
//     }
    
//     @Override
//     void move(){
//         System.out.printf("%d만큼 이동합니다.\n",speed); // speed 필드 사용
//     }
// }

// class Knight extends Novice{
//     int stamina;

//     void slash(){
//         System.out.printf("%s(HP: %d, ST: %d)의 슬래쉬!!\n",name,hp,stamina);
//     }
    
//     @Override
//     void move(){
//         System.out.printf("%d만큼 이동합니다.\n",speed); // speed 필드 사용
//     }
// }
