package a0328.test;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample10 {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>(Arrays.asList(1,3,5,7,9));
        Calculator4 cal = new Calculator4();
        int result = cal.avg(data);
        System.out.println(result);
    }
    
}

class Calculator4{
    int sum = 0;
    public int avg(ArrayList<Integer> data) {
        for (int num : data) {
            sum += num;
        }
        return sum/data.size();
    }
    
}