package a0320.Gen;

public class GenericExample {
    public static void main(String[] args) {
        //Integer 타입의 Box생성
        Box<Integer> intBox = new Box<>(10);
        int data = intBox.getData();
        System.out.println("Integer 데이터 : " + data);
        //Box<Int>가 아닌 Box<Integer>처럼 사용하는 이유는 
        //제네릭은 참조형타입만 가질수 있다.
        // int => 기본형타입
        // Wrapper 클래스를 이용하여 Integer 라고 하면 참조형타입으로 변환
        
        //String 타입의 box 생성
        Box<String> strBox = new Box<>("10");
        String data2 = strBox.getData();
        System.out.println("String 데이터 : " + data2);
        //다양한 타입의 데이터를 저장할 수 있고 코드를 재활용할 수 있다.
        



    }
    
}

class Box<T>{
    private T data;
    
    public Box() {

    }
    public Box(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
}