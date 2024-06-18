package a0328.test;

public class Sample1 {
    public static void main(String[] args) {
        String a = "a:b:c:d";
        String b = a.replaceAll(":", "#");
        System.out.println(b);
    }
    
}
