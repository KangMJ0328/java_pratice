package a0318;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);
    //  Account[] , scanner  인스턴스가 고유하는 공통된
    // 상태이므로 ' static' 키워드를 사용
    
    public static void main(String[] args) {
        boolean run = true;
        while(run){
            System.out.println("------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택>");

           int selectNo = Integer.parseInt(scanner.nextLine());
           if(selectNo ==1){
             createAccount(); //계좌생성
           }else if(selectNo ==2){
             accountList(); //계좌목록
           }else if(selectNo ==3){
             deposit(); //예금하기
           }else if(selectNo == 4) {
            withdraw(); //출금하기
           } else if(selectNo == 5) {
                run = false;
           }      
        }
        System.out.println("프로 그램 종료");
    }
    //계좌생성하기
    private static void createAccount(){
        System.out.println("--------------");
        System.out.println("계좌생성");
        System.out.println("--------------");
        //계좌를 생성하려면 계좌번호, 계좌주, 초기입금액
        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();
        
        System.out.print("계좌주: ");
        String owner = scanner.nextLine();
 
        System.out.print("초기입금액: ");
        int balance = Integer.parseInt(scanner.nextLine());

       Account newAccount = new Account(ano, owner, balance);

       for(int i=0; i<accountArray.length;i++){
           if(accountArray[i] == null){// 해당 인덱스에 새로운 계좌생성
            accountArray[i] = newAccount;
            System.out.println("결과: 계좌가 생성되었습니다.");
            break;
           } 
           //배열 비어있는 요소를 찾아서 그자리에 새로운 계좌 추가
           //추가된 계좌의 생성 여부를 메세지로 출력
       }

    }
    //계좌목록보기
    private static void accountList(){
        System.out.println("--------------");
        System.out.println("계좌목록");
        System.out.println("--------------");    
        for(int i=0; i<accountArray.length;i++){
            Account account= accountArray[i];
            if(account != null){
                System.out.print(account.getAno());
                System.out.print(" ");
                System.out.print(account.getOwner());
                System.out.print(" ");
                System.out.print(account.getBalance());
                System.out.print(" ");
                System.out.println();
            }
        }
    }
    //예금하기
    private static void deposit(){
        System.out.println("--------------");
        System.out.println("예금");
        System.out.println("--------------"); 
        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();
        System.out.print("예금액: ");
        int money= Integer.parseInt(scanner.nextLine());
        Account account= findAccount(ano);
        if(account == null){
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        account.setBalance(account.getBalance() + money);
        //현재 잔액에 새로입금한 money를 더해서
        //새로운 잔액으로 지정
        System.out.println("결과: 예금이 성공되었습니다.");
    }

     //출금하기
     private static void withdraw(){
        System.out.println("--------------");
        System.out.println("출금");
        System.out.println("--------------"); 
        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();
        System.out.print("출금금액: ");
        int money= Integer.parseInt(scanner.nextLine());
        Account account = findAccount(ano);
        if(account == null){
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        account.setBalance(account.getBalance() - money);
        //현재 잔액에 새로입금한 money를 빼서
        //새로운 잔액으로 지정
        System.out.println("결과: 출금이 성공되었습니다.");
    }

    //Account 배열에서 ano와 동일한 Account 객체 찾기
    private static Account findAccount(String ano){
        Account account = null; // 초기화 - 일치하는 계좌 찾을때 사용
        for(int i=0; i < accountArray.length; i++){
            if(accountArray[i] != null){ //계좌의 내용이 있을때까지
                String dbano = accountArray[i].getAno();
                if(dbano.equals(ano)){ //계좌찾은경우 
                   account = accountArray[i]; 
                   //account 찾은계좌를 할당
                   break;
                }
            }
        }
        return account;
    }

}
