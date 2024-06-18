package a0326.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class optional1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,5,7,9);
        Optional<Integer> max = findMax(numbers);
        if(max.isPresent()){
            System.out.println("최대값 " + max.get());
        }else{
            System.out.println("최대값이 없습니다.");
        }
    }

    private static Optional<Integer> findMax(List<Integer> numbers) {
        if(numbers == null || numbers.isEmpty()){
            return Optional.empty();
        }
        Integer max = numbers.get(0);
        for(Integer num : numbers){
            if(num > max) {
                max = num;
            }
        }
        return Optional.of(max);
    }
}
