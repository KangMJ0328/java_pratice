package a0319.ex01;

public class Movie1 {
    public static void main(String[] args) {
        ActionMovie am = new ActionMovie("범죄도시");
        HorrorMovie hm = new HorrorMovie("여고괴담");
        ComedyMovie cm = new ComedyMovie("극한직업");
        int sum = 0;
        sum += am.discountedPrice();
        sum += hm.discountedPrice();
        sum += cm.discountedPrice();
        System.out.printf("총 예매 금액: %d원", sum);
    }
    
}
abstract class Movie {
    protected String name;
    protected int price = 10000;
    protected double discountRate = 0.1;

    public Movie(String name) {
        this.name = name;
    }
    public double discountedPrice(){
        return price*(1-discountRate);
    }
}
class ActionMovie extends Movie{
    public ActionMovie(String name){
        super(name);
    }
    public double discountedPrice(){
        return super.discountedPrice()-1000;
    }
}
class HorrorMovie extends Movie{
    public HorrorMovie(String s){
        super(s);
        
    }
    public double discountedPrice(){
        return super.discountedPrice()-800;
    }
}
class ComedyMovie extends Movie{
    public ComedyMovie(String s){
        super(s);
        
    }
    public double discountedPrice(){
        return super.discountedPrice()-1500;
    }
}
