package a0312.car1;

public class TvExample {
    public static void main(String[] args) {
        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채녈은 " + t.channel + " 입니다.");
    }   
}
