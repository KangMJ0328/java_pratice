package a0312.car1;

public class Tv {
    
    //Tv의 속성(멤버변수)
    String color; //색상
    boolean power; //전원상태(on/off)
    int channel; // 채널

    //Tv의 기능(메서드)
    void power() {power = !power;} //return 하지 않는다.
    void channelUp(){++channel;}
    void channelDown(){--channel;}

}
