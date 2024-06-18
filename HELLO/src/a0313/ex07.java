package a0313;

public class ex07 {
    public static void main(String[] args) {
        Account a = new Account("123-45",10000);
        Account b = new Account("567-89",10000);
        while (a.transfer(b,3000)){
            ;
        }
        System.out.println(a.toStr());
        System.out.println(b.toStr());
    }
    
}
class Account {
    String num;
    int balance;
    Account(String n ,int b){
        num = n;
        balance = b;
    }
    boolean transfer(Account money,int amount){
        if (amount > balance) {
            return false;
        }

        balance -= amount;
        money.balance += amount;
        return true;
    }
    
    String toStr() {
        return "Account {num: " + num + ", balance: " + balance+" }";
    }
}
