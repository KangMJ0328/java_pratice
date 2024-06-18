package a0319.ex01;

public class CurrencyTest {
    public static void main(String[] args) {
        KRW won = new KRW(1500.00);
        USD dollar = new USD(100.50);
        EUR euro = new EUR(260.75);
        Currency[] currency = {won,dollar,euro};
        for(int i = 0; i<currency.length;i++){
            currency[i].printInfo();
        }
    }
}

abstract class Currency{
    protected double won;
    protected double dollar;
    protected double euro;
    public Currency(double d){
        won = d;
        dollar = d;
        euro = d;
    }
    public void printInfo() {
        System.out.println(won+dollar+euro+"화폐");
    }
    
}

class KRW extends Currency{
    KRW(double d){
        super(d);
    }
    public void printInfo(){
        System.out.println("KRW: "+won+" 원");
    }
}
class USD extends Currency{
    USD(double d){
        super(d);
    }
    public void printInfo(){
        System.out.println("USD: "+dollar+" 달러");
    }
}
class EUR extends Currency{
    EUR(double d){
        super(d);
    }
    public void printInfo(){
        System.out.println("EUR: "+euro+" 유로");
    }
}