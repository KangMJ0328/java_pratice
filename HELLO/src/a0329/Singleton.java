package a0329;

public class Singleton {
    //정적 참조 변수(싱글톤 객체를 담을수 있는 변수)- 
    // 단일객체를 저장하기위한 정적 참조 변수
    private static Singleton singletonObject;

    private Singleton(){

    }

    public static Singleton getInstance() {
        if(singletonObject == null){
            singletonObject = new Singleton();    
            //최조로 실행할때만 초기화 한다.(지연 초기화)       
        }
        return singletonObject;
    }   

}
