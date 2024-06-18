package a0326.stream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class Stream7 {
    public static void main(String[] args) {
        //Integer 외부 반복자
        List<Integer> list = (List) Arrays.asList(10,20,30,40,50);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer value = iterator.next();
            System.out.print(value + " ");
        }
    }
    
}
