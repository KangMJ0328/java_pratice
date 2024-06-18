package a0307;

public class Null {
    public static void main(String[] args) {
        int[] intArray = null;
        intArray[0] = 10;
        //intArray가 참조하려는 배열 객체가 없으므로 10을 저장할 수없다.

        String str = null;
        System.out.println("총 문자 수: " + str.length() );
      
        //java의 모든객체는 기본적으로 null로 초기화 되어있음
        //null 값이 없음 또는 존재하지않음을 나타내며
        //객체가 아무런 내용을 가지고 있지 않다.

        //nullPointerException
        //1. null 값을 가진 객체에 접근하려고 할때
        //2. 어떤객체가 'null'을 참조하고 있는데, 그객체의 매서드나 
        //속성등을 호출하거나 사용하려고 할때 발생 
    }
}
