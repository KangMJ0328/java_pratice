package a0329;

public class Sing {
    public static void main(String[] args) {
        //private 생성자(에러발생)
        //Singleton singleton = new Singleton();
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance3);
        System.out.println(instance1 == instance2);
        System.out.println(instance1 == instance3);

    }
}
// 싱글톤 패턴은 객체의 인스턴스가 단 하나만을 생성하도록 만드는 디자인 패턴이다.
// private 생성자를 가져야 하는 특징이 있다.
// 단일 객체 참조 변수는 static 이어야 하고 getInstance() 메서드를 참조한다.
// 변경 여지가 있는 상태 값을 가지지 않는 것이 좋다.
// 멀티 스레드 환경의 경우 Thread Safe한 구현 방법을 고려해야 한다.