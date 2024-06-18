package a0325.exception;


class FoolException1 extends Exception {
}
//체크예외 - 반드시 예외처리 해줘야함
public class Sample1 {
    public void sayNick(String nick) {
        try{
            if("바보".equals(nick)) {
                throw new FoolException1();
            }
            System.out.println("당신의 별명은 "+nick+" 입니다.");
        }catch(FoolException1 e){
            System.err.println("FoolException이 발생했습니다.");
        }
        
    }

    public static void main(String[] args) {
        Sample1 sample1 = new Sample1();
        sample1.sayNick("바보");
        sample1.sayNick("야호");
    }
}
