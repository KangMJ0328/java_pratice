package a0319.inter2;

public class RemoteControlExample {
    public static void main(String[] args) {
        //인터페이스 변수 선언
        RemoteControl rc;

        //television 객체를 생성하고 인터페이스 변수에 대입
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        // Television tv = new Television();
        // tv.turnOn();
        // tv.setVolume(5);

        //디폴트 메소드 호출
        rc.setMute(true);
        rc.setMute(false);
        //setMute() 메소드가 television에 재정의 되있지 않으므로 인터페이스의 디폴트 메서드로 사용됨.


        //Audio 객체를 생성하고 인터페이스 변수에 대입
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);

        //디폴트 메소드 호출
        //Audio에서 재정의 된 메소드가 실행
        rc.setMute(true);
        rc.setMute(false);
    }
}
