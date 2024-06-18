package a0326.streamEx;

public class Transaction {
    private Trader trader;
    private int year;
    private int value;

    public Trader getTrader() {
        return trader;
    }
    public int getYear() {
        return year;
    }
    public int getValue() {
        return value;
    }

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }
    public String toString(){
        return "{ name : " + this.trader.getName()+", city : "+this.trader.getCity() +  ", year : " + this.year + ",value : " + this.value + "}";
    }    
}
