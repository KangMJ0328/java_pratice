package a0328.test;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample11 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> b = a;
        a.add(4);
        System.out.println(b.size());
    }
    
}
