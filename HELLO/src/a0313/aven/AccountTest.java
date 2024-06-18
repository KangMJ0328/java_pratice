package a0313.aven;

public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account();
        //acc.balance(1000); 에러발생
        acc.setBalance(1000);
        System.out.printf("잔액 : %d",acc.getBalance());
    }
}

class Account {
    private int balance; // 잔액, private 적용

    //게터 메소드 - 값을 읽을때 사용
    public int getBalance(){
        return balance;
    }
    //세터 메소드 - 값을 지정할때 사용
    //정보의 은닉, 캡슐화 
    public void setBalance(int b){
        balance = b;
    }

}