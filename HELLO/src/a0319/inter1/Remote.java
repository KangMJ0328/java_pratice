package a0319.inter1;

import a0319.inter2.RemoteControl;

public class Remote {
    public static void main(String[] args) {
        System.out.println("리모콘 최대 볼륨: "+RemoteControl.MAX_VOLUME);
        System.out.println("리모콘 최소 볼륨: "+RemoteControl.MIN_VOLUME);
    }
    
}
interface RemoteControl1{
    int MAX_VOLUME = 10; //public static final 
    int MIN_VOLUME = 0;
    //상수명은 대문자로 작성하되, 서로다른 단어로 구성되면 언더바(_)로 연결하는 것이 관례이다.

}
