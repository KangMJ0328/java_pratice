package a0314;
import java.util.Scanner;
public class BankApplication {
    private static Account[] accountArray = new Account[100];
    private static Scanner sc = new Scanner(System.in);
    // Account[], scanner 인스턴스가 고유하는 공통된 상ㅌ애이므로 ' static '키워드를사용
    public static void main(String[] args) {
        boolean run = true;
        
        while(run){
            System.out.println("--------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("--------------------------------------------------");
            System.out.print("선택>");
            
            int choice = sc.nextInt(); 
            
            if(choice==1){
                createAccount();
                
            }else if(choice==2){
                accountList();
                
            }else if(choice==3){
                deposit();
                
            }else if(choice==4){
                withdraw();
            }else if(choice==5){
                run=false;
            }
            }
        }

    static void createAccount(){
        System.out.print("계좌번호: ");
        String ano = sc.next();
        sc.nextLine(); // 버퍼 비우기  이건 오류떠서 찾아본 해결방법중 하나
        System.out.print("계좌주: ");
        String owner = sc.nextLine();
        System.out.print("초기입금액: ");
        int balance = sc.nextInt();
        
        Account account = new Account(ano, owner, balance); // 새로운 account생성해서 입력받은 값들 넣기
        
        for(int i = 0; i < accountArray.length; i++){ 
            if(accountArray[i] == null){ //배열안에 아무것도 없을때 넣기 오류방지
                 accountArray[i] =account;
                break;
            }
        }
        System.out.println("계좌가 생성되었습니다.");
        // System.out.println(Arrays.toString(accountArray)); // toString말고 게터이용해서 출력하기
    }
    
    static void accountList(){
        System.out.println("----------");
        System.out.println("계좌목록");
        System.out.println("----------");
        // System.out.println(accountArray.length);
        for (int i = 0; i < accountArray.length; i++) {
            Account account = accountArray[i];
            if (accountArray[i] != null) {
                System.out.println(account.getAno() + "   " + account.getOwner() + "   " + account.getBalance()); // 배열안에 있는 정보들 게터로 빼오기
            }
        }
        
    }
    static void deposit(){
        System.out.println("----------");
        System.out.println("예금");
        System.out.println("----------");
        System.out.print("계좌번호:");
        String ano = sc.next();
        sc.nextLine();
        Account account = findAccount(ano); //findAccount 메서드 생성하고 사용해서 ano라는 매개변수 넣고 위에서 입력된 계좌번호 찾아서 account에 저장
        System.out.print("예금액:");
        int amount =sc.nextInt();
        
        if (account != null) {
            account.setBalance(account.getBalance() + amount); //찾은 계좌 account의 저장된 잔액에 amount받은값 넣기 
            System.out.println("예금이 성공되었습니다. 현재 잔액: " + account.getBalance());
        } else {
            System.out.println("존재하지 않습니다.");
        }
    }
    static void withdraw(){
        System.out.println("----------");
        System.out.println("출금");
        System.out.println("----------");
        System.out.println("계좌번호:");
        String ano = sc.next();
        Account account = findAccount(ano);
        // System.out.println("계좌번호:"+ano);
        // System.out.println("출금액:"+bb);
        System.out.print("출금액:");
        int amount = sc.nextInt();
        if (account != null) {
            if (account.getBalance() >= amount) { //account.getBalance findAccount로 찾은 계좌번호의 잔액 가져오기
                account.setBalance(account.getBalance() - amount); // 가져온 계좌잔액에 예금액 
                System.out.println("출금 성공되었습니다. 현재 잔액: " + account.getBalance()); 
            } else {
                System.out.println("잔액이 부족합니다.");
            }
        } else {
            System.out.println("해당 계좌가 존재하지 않습니다.");
        }
    }
    static Account findAccount(String ano) {
        for (int i = 0; i < accountArray.length; i++) {
            Account account = accountArray[i];
            if (account != null && account.getAno().equals(ano)) {
                return account;
            }
        }
        return null;
    }
}
