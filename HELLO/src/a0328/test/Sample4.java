package a0328.test;

import java.util.HashMap;

public class Sample4 {
    public static void main(String[] args) {
        HashMap<String,Integer> grade = new HashMap<>();
        grade.put("A",90);
        grade.put("B",80);
        grade.put("C",70);
        int result = grade.remove("B");
        System.out.println(result);
        System.out.println(grade);
    }
}
