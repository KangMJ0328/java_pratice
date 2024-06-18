package a0320.member;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        
       DAO test = new DAO(); //test DAO객체생성
       
       Scanner sc = new Scanner(System.in);
       while (true) {
            System.out.println("1. 회원정보 입력");
            System.out.println("2. 회원정보 삭제");
			System.out.println("3. 회원정보 검색");
			System.out.println("4. 회원정보 수정");
			System.out.println("5. 회원 목록 보기");
			System.out.println("6. 파일로 저장하기");
			System.out.println("7. 회원정보 파일 불러오기");
			System.out.println("0. 종료");

            System.out.print(">> ");

            int choice;
            try{
                choice = sc.nextInt();
            }catch (Exception e){
                choice = -1;
            }

            if(choice ==1 ){
                test.userInsert(); 
            }else if (choice == 2) {
				test.userDelete();
			} else if (choice == 3) {
				test.userSelect();
			} else if (choice == 4) {
				test.userUpdate();
			} else if (choice == 5) {
				test.printAll();
			}else if (choice == 6){
                try{
                    test.dataSave();
                }catch(Exception e){ //Exception 모든예외의 부모
                    //예외가 발생하면 e변수에 전달되고 이를이용 예외처리를 합니다.
                    e.printStackTrace();//예외정보출력
                    //예외가 발생한 위치와 예외의 내용을 확인
                }
            }else if(choice == 7){
                test.dataLoad();
            }else if (choice == 0) {
				System.out.println("종료합니다.");
				sc.close();
				System.exit(0);
			}else{
                System.out.println("잘못 선택했습니다.");
            }


       } 

       
    }
}
