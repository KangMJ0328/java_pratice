package a0326.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LamdaEx {
    public static void main(String[] args) {
        List<Customer> list = (List) Arrays.asList(
            new Customer("박태호", 1500),
            new Customer("오수철",700));
        //컬렉션으로부터 스트림 얻기 -> List 컬렉션의 참조변수를 통해서
        Stream<Customer> stream = list.stream();
        stream.forEach(s->{
            String name = s.getName();
            int score = s.getPoint_score();
            System.out.println(name+ "=> 포인트점수" + score+"점");
            
        });

    }
    
}
