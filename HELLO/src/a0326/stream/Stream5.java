package a0326.stream;

import java.util.stream.Stream;

public class Stream5 {
    public static void main(String[] args) {
        // 가변 매개변수에서 스트림 생성
        Stream<Double> stream = Stream.of(4.2,2.5,3.1,1.9);
        stream.forEach(System.out::println);
        //of() 메소드를 사용하면 가변 매개변수를 전달받아 스트림 생성
        
    }
    
}
