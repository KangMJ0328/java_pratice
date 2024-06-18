package a0325.exception;


class FoolException2 extends Exception {
}
//체크예외 - 반드시 예외처리 해줘야함
public class Sample2 {
    public void sayNick(String nick) throws FoolException2 {
      
            if("바보".equals(nick)) {
                throw new FoolException2();
            } 
            System.out.println("당신의 별명은 "+nick+" 입니다.");             
    }

    public static void main(String[] args) {
        
        Sample2 sample2 = new Sample2();
        try{
            sample2.sayNick("바보");
            sample2.sayNick("야호");
        }catch(FoolException2 e){
            System.err.println("FoolException이 발생했습니다.");
        }
    }
}
//메인에서 예외처리를 하면 이미 첫번째 문장에서 catch문을 빠져버리기 때문에
//두번째 문장을 실행 하지 않는다.
